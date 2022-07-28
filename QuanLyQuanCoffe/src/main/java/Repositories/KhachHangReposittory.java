package Repositories;

import Models.KhachHang;
import Models.SanPham;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class KhachHangReposittory {
    Session session = HibernateUtil.getFACTORY().openSession();
    List<KhachHang> khachHangs;

    public KhachHangReposittory() {
        khachHangs = session.createQuery("From KhachHang").getResultList();
    }
    public List<KhachHang> getList() {
        khachHangs = new ArrayList<KhachHang>();
        Query query = session.createQuery("From SanPham");
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
            session.delete(khachHang);
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
            Query query = session.createQuery("update KhachHang set TenKH = :t , SDT = :g  "+" + Where Id = :i");
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

}
