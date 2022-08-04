package Repositories;

import Models.KhachHang;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

public class KhachHangReposittory {

  

    public KhachHangReposittory() {

    }
    public List<KhachHang> getList() {
       Session session = HibernateUtil.getFACTORY().openSession();
        
        Query query = session.createQuery("From KhachHang");        
        return query.getResultList();
        
    }
    public Boolean save(KhachHang khachHang) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            tx = session.beginTransaction();
            session.save(khachHang);
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
            Query query = session.createQuery("DELETE FROM KhachHang WHERE id = :i");
            query.setParameter("i", khachHang.getId());
            query.executeUpdate();
//            session.delete(khachHang);
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
            Query query = session.createQuery("update KhachHang set TenKH = :t , SDT = :g , TT = :tt "+" Where id = :i");
            query.setParameter("t", khachHang.getTenKH());
            query.setParameter("g", khachHang.getSDT());
            query.setParameter("i", khachHang.getId());
            query.setParameter("tt", khachHang.isTT());
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
