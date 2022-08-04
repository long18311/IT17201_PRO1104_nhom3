package Repositories;

import Models.HoaDon;
import Models.HoaDonCT;
import Models.SanPham;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;
import org.hibernate.query.Query;

public class HoaDonCTRepository {
   

    public HoaDonCTRepository() {
        
    }

    public List<HoaDonCT> getList() {
         Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From HoaDonCT ");// truy vấn trên entity(HQL)
        return query.getResultList();
    }
    public List<HoaDonCT> getList(HoaDon hoaDon) {
         Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From HoaDonCT where hoaDon = :u");
        query.setParameter("u", hoaDon);
        return query.getResultList();
    }
    public Boolean save(HoaDonCT hoaDonCT) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDonCT);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    public Boolean delete(HoaDonCT hoaDonCT) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoaDonCT);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    public Boolean update(HoaDonCT hoaDonCT) {
        Transaction transaction = null;
        try  (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            Query query = session.createQuery("update HoaDonCT set SoLuong = :n, giaLM = :gg, sanPham = :m, hoaDon = :u"
                    + " where id = :i ");
            query.setParameter("u", hoaDonCT.getHoaDon());
            query.setParameter("m", hoaDonCT.getSanPham());
            query.setParameter("n", hoaDonCT.getSoLuong());
            query.setParameter("gg", hoaDonCT.getGiaLM());
//            query.setParameter("i", hoaDonCT.getId());
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public HoaDonCT getById(long id) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            HoaDonCT hoaDonCT = session.get(HoaDonCT.class, id);
            return hoaDonCT;
        } catch (Exception e) {
        }
        return null;
    }
    public static void main(String[] args) {
        List<HoaDonCT> hdcts = new HoaDonCTRepository().getList();
        for (int i = 0; i < hdcts.size(); i++) {
            System.out.println(hdcts.get(i).getId());
        }
        System.out.println("vui");
        HoaDon n = new HoaDonRepository().getById(4);
        SanPham m = new SanPhanRepository().getbyID(4);
        HoaDonCT hdct = new HoaDonCT(n,m,3,110000);
        if(new HoaDonCTRepository().save(hdct)){
            System.out.println("Thành công");
        }
        else{
            System.out.println("that bai");
        }
    }
}
