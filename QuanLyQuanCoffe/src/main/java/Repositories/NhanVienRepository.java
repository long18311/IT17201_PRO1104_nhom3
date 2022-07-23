/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Models.NhanVien;
import Utilities.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vanlo
 */
public class NhanVienRepository {

    Session session = HibernateUtil.getFACTORY().openSession();
    List<NhanVien> nhanViens;

    public NhanVienRepository() {
        nhanViens = new ArrayList<>();
    }

     public List<NhanVien> getList() {
         nhanViens = new ArrayList<>();
        Query query = session.createQuery("From NhanVien ");// truy vấn trên entity(HQL)
        nhanViens = query.getResultList();
        return nhanViens;
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
        return null;
    }
     public Boolean update(NhanVien nhanVien) {

        Query query = session.createQuery("update LopHoc set UserName = :u, MatKhau = :m, Ten_NV = :n, NgaySinh = :s,SDT = :d,Email = :e, ChucVu = :c"
                + " where Id = :id");
        query.setParameter("u", nhanVien.getUserName());
        query.setParameter("m", nhanVien.getMatKhau());
        query.setParameter("n", nhanVien.getTen_NV());
        query.setParameter("s", nhanVien.getNgaySinh());
        query.setParameter("d", nhanVien.getSDT());
        query.setParameter("e", nhanVien.getEmail());
        query.setParameter("c", nhanVien.getChucVu());
        query.setParameter("id", nhanVien.getId());
        query.executeUpdate();
        return true;
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
