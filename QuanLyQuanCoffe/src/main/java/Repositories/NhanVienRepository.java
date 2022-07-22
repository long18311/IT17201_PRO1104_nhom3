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
        org.hibernate.query.Query query = session.createQuery("From NhanVien ");// truy vấn trên entity(HQL)
        List<NhanVien> list = query.getResultList();
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new NhanVienRepository().getList().size());
    }
}
