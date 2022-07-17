package Repositories;

import DomainModels.HocVien;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;


public class HocVienRepository implements IHocVienRepository {

    @Override
    public List<HocVien> findAll() {
        List<HocVien> HocViens;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM HocVien p";
            TypedQuery<HocVien> query = session.createQuery(hql, HocVien.class);
            HocViens = query.getResultList();
        }
        return HocViens;
    }

    @Override
    public HocVien findById(int maHV) {
        HocVien hocVien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM HocVien p WHERE p.maHV = :maHV";
            TypedQuery<HocVien> query = session.createQuery(hql, HocVien.class);
            query.setParameter("maHV", maHV);
            hocVien = query.getSingleResult();
        }
        return hocVien;
    }

    @Override
    public HocVien save(HocVien hocVien) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.beginTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(hocVien);
                trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            hocVien = null;
        }} finally {
            return hocVien;
        }

    }

    @Override
    public long delete(int maHV) {
        int id = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.beginTransaction();
            try {
                String hql = "DELETE HocVien p WHERE p.maHV = :maHV";
                Query query = session.createQuery(hql);
                query.setParameter("maHV", maHV);
                int result = query.executeUpdate();
                if (result == 0) {
                    id = 0;
                }
                trans.commit();
            } catch (Exception e) {
                id = -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.maHV) FROM HV p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
}
