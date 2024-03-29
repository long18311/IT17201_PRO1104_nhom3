/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Models.NhanVien;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author vanlo
 */
public class NhanVienRepository {

   

    public NhanVienRepository() {
    }

     public List<NhanVien> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From NhanVien");// truy vấn trên entity(HQL)
        return query.getResultList();
    }
    public Boolean save(NhanVien nhanVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }
    public Boolean delete(NhanVien nhanVien) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
     public Boolean update(NhanVien nhanVien) {
        Transaction transaction = null;
      try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update NhanVien set UserName = :u, MatKhau = :m, Ten_NV = :n, NgaySinh = :s,SDT = :d,Email = :e, ChucVu = :c, TT = :tt"
                    + " where id = :id");
            query.setParameter("u", nhanVien.getUserName());
            query.setParameter("m", nhanVien.getMatKhau());
            query.setParameter("n", nhanVien.getTen_NV());
            query.setParameter("s", nhanVien.getNgaySinh());
            query.setParameter("d", nhanVien.getSDT());
            query.setParameter("e", nhanVien.getEmail());
            query.setParameter("c", nhanVien.isChucVu());
            query.setParameter("id", nhanVien.getId());
            query.setParameter("tt", nhanVien.isTT());
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public NhanVien getById(long id) {
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            NhanVien nhanVien = session.get(NhanVien.class, id);
            return nhanVien;
        } catch (Exception e) {
        }
        return null;
    }
}
