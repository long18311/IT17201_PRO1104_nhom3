package Repositories;

import Models.HoaDonCT;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class HoaDonCTRepository {
    Session session = HibernateUtil.getFACTORY().openSession();
    List<HoaDonCT> hoaDonCTs;

    public HoaDonCTRepository() {
        hoaDonCTs = new ArrayList<>();
    }

    public List<HoaDonCT> getList() {
        hoaDonCTs = new ArrayList<>();
        Query query = session.createQuery("From HoaDonCT");// truy vấn trên entity(HQL)
        hoaDonCTs = query.getResultList();
        return hoaDonCTs;
    }
    public Boolean save(HoaDonCT hoaDonCT) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDonCT);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
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
        try  {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update HoaDonCT set  sanPham = :m, SoLuongSP = :n,"
                    + " where hoaDon = :u");
            query.setParameter("u", hoaDonCT.getHoaDon());
            query.setParameter("m", hoaDonCT.getSanPham());
            query.setParameter("n", hoaDonCT.getSoLuongSP());
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
}
