package Repositories;

import Models.KhachHang;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

public class KhachHangReposittory {
    Session session = HibernateUtil.getFACTORY().openSession();
    List<KhachHang> khachHangs;

    public KhachHangReposittory() {
        khachHangs = session.createQuery("From KhachHang").getResultList();
    }
    public List<KhachHang> getList() {
        khachHangs = new ArrayList<KhachHang>();
        Query query = session.createQuery("From KhachHang");
        khachHangs = query.getResultList();
        return khachHangs;
    }
    public Boolean save(KhachHang sanPham) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            tx = session.beginTransaction();
            session.save(sanPham);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public Boolean delete(KhachHang khachHang) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tx = session.beginTransaction();
//            Session session = HibernateUtil.getFACTORY().openSession();
            Query query = session.createQuery("DELETE FROM KhachHang k WHERE k.id = :id");
            query.setParameter("id", khachHang.getId());
            query.executeUpdate();
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public Boolean update(KhachHang khachHang) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tx = session.beginTransaction();
            Query query = session.createQuery("update KhachHang set TenKH = :t , SDT = :g  "+" Where Id = :i");
            query.setParameter("t", khachHang.getTenKH());
            query.setParameter("g", khachHang.getSDT());
            query.setParameter("i", khachHang.getId());
            query.executeUpdate();
            tx.commit();
            return true;
        } catch(Exception e){
            return false;
        }

    }
    public KhachHang getbyID(long id){
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            KhachHang khachHang = session.get(KhachHang.class,id);
            return khachHang;
        }catch(Exception e){
            return null;
        }
    }
     public static void main(String[] args) {
         KhachHangReposittory NV = new KhachHangReposittory();
         List<KhachHang> NVs = new ArrayList<>();
         NVs = NV.getList();
         System.out.println("vui");
        System.out.println(NVs.size());
        for (KhachHang nv : NVs) {
            System.out.println(nv.getId());
        }
         System.out.println("/////////");
         if (NV.delete(NVs.get(10))) {
             System.out.println("Delete thành công");
         } else{
             System.out.println("Delete lôi");
         }
         System.out.println("/////////");
         NVs = new ArrayList<>();
         NVs = NV.getList();
         System.out.println(NVs.size());
        for (KhachHang nv : NVs) {
            System.out.println(nv.getId());
        }
         
     }
}
