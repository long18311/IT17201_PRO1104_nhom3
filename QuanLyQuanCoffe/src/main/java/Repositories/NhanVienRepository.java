package Repositories;

import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;

public class NhanVienRepository implements INhanVienRepository {
    @Override
    public List<NhanVien> findAll() {
        List<NhanVien> NhanViens;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            NhanViens = query.getResultList();
        }
        return NhanViens;
    }

    @Override
    public NhanVien findById(String maCD) {
        NhanVien NhanVien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p WHERE p.maNV = :maNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("maNV", maCD);
            NhanVien = query.getSingleResult();
        }
        return NhanVien;
    }

    @Override
    public NhanVien save(NhanVien nhanVien) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(nhanVien);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                nhanVien = null;
            }
        }finally {
            return nhanVien;
        }
    }

    @Override
    public long delete(String maNV) {
        int result;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE NhanVien p WHERE p.maNV = :maNV";
                Query query = session.createQuery(hql);
                query.setParameter("maNV", maNV);
                result = query.executeUpdate();

                trans.commit();
            } catch (Exception e) {
                result=-1;
            }
            return result;
        }
    }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.id) FROM NhanVien p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
}
