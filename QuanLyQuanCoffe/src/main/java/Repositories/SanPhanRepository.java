package Repositories;

import Models.SanPham;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class SanPhanRepository {
   Session session = HibernateUtil.getFACTORY().openSession();
   List<SanPham> sanPhams;

    public SanPhanRepository() {
        sanPhams = session.createQuery("From SanPham").getResultList();
    }
    public List<SanPham> getList() {
        sanPhams = new ArrayList<SanPham>();
        Query query = session.createQuery("From SanPham");
        sanPhams = query.getResultList();
        return sanPhams;
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
            Query query = session.createQuery("update SanPham set Ten = :t , GiaBan = :g , MoTa = :m ,SoLuongSP = :s ,Anh = :a "+" + Where id = :i");
            query.setParameter("t", sanPham.getTen());
            query.setParameter("g", sanPham.getGiaBan());
            query.setParameter("m", sanPham.getMoTa());
            query.setParameter("s", sanPham.getSoLuong());
            query.setParameter("a", sanPham.getAnh());
            query.setParameter("i", sanPham.getId());
            query.executeUpdate();
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
