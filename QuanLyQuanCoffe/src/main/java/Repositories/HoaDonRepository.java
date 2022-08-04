package Repositories;

import Models.HoaDon;
import Models.NhanVien;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

public class HoaDonRepository {
   
   

    public HoaDonRepository() {
       
    }

    public List<HoaDon> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From HoaDon ");// truy vấn trên entity(HQL)
        return query.getResultList();
    }
    public Boolean save(HoaDon hoaDon) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }
    public Boolean delete(HoaDon hoaDon) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    public Boolean update(HoaDon hoaDon) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            Query query = session.createQuery("update HoaDon set khachHang = :u, TinhTrangHD = :m, NgayTT = :n,TTGiamGia = :d "
                    + "where id = :i");
            query.setParameter("u", hoaDon.getKhachHang());
            query.setParameter("m", hoaDon.isTinhTrangHD());
            query.setParameter("n", hoaDon.getNgayTT());
            query.setParameter("d", hoaDon.getTTGiamGia());
            query.setParameter("i", hoaDon.getId());
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public HoaDon getById(long id) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            HoaDon hoaDon = session.get(HoaDon.class, id);
            return hoaDon;
        } catch (Exception e) {
        }
        return null;
    }
}
