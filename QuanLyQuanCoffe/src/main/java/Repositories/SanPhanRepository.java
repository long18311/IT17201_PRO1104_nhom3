package Repositories;

import Models.SanPham;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;

public class SanPhanRepository {
   

    public SanPhanRepository() {
    }
    public List<SanPham> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From SanPham");
        return query.getResultList();
    }
    public Boolean save(SanPham sanPham) {
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
    public Boolean delete(SanPham sanPham) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tx = session.beginTransaction();
            session.delete(sanPham);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public Boolean update(SanPham sanPham) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tx = session.beginTransaction();
            Query query = session.createQuery("update SanPham set Ten = :t , GiaBan = :g , MoTa = :m , TT = :tt "+"Where id = :i");
            query.setParameter("t", sanPham.getTen());
            query.setParameter("g", sanPham.getGiaBan());
            query.setParameter("m", sanPham.getMoTa());
            query.setParameter("i", sanPham.getId());
            query.setParameter("tt", sanPham.isTT());
            query.executeUpdate();
//             session.update(sanPham);
            tx.commit();
            return true;
        } catch(Exception e){
            return false;
        }

    }
    public SanPham getbyID(long id){
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            SanPham sanpham = session.get(SanPham.class,id);
            return sanpham;
        }catch(Exception e){
            return null;
        }
    }
}
