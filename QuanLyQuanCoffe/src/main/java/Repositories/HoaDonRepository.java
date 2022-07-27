package Repositories;

import Models.HoaDon;
import Models.NhanVien;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository {
    Session session = HibernateUtil.getFACTORY().openSession();
    List<HoaDon> hoaDons;

    public HoaDonRepository() {
        hoaDons = new ArrayList<>();
    }

    public List<HoaDon> getList() {
        hoaDons = new ArrayList<>();
        Query query = session.createQuery("From HoaDon ");// truy vấn trên entity(HQL)
        hoaDons = query.getResultList();
        return hoaDons;
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
        try  {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update HoaDon set khachHang = :u, TinhTrangHD = :m, NgayTT = :n,TTGiamGia = :d,TTThanhToan = :e"
                    + " where Id = :i");
            query.setParameter("u", hoaDon.getKhachHang());
            query.setParameter("m", hoaDon.isTinhTrangHD());
            query.setParameter("n", hoaDon.getNgayTT());
            query.setParameter("d", hoaDon.getTTGiamGia());
            query.setParameter("e", hoaDon.getTTThanhToan());
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
