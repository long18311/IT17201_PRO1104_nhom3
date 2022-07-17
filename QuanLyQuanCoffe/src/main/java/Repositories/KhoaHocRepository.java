package Repositories;

import DomainModels.KhoaHoc;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class KhoaHocRepository implements IKhoaHocRepository {

    @Override
    public List<KhoaHoc> findAll() {
        List<KhoaHoc> KhoaHocs;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhoaHoc p";
            TypedQuery<KhoaHoc> query = session.createQuery(hql, KhoaHoc.class);
            KhoaHocs = query.getResultList();
        }
        return KhoaHocs;
    }

    @Override
    public KhoaHoc findById(int maCD) {
        KhoaHoc KhoaHoc;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhoaHoc p WHERE p.maCD = :maCD";
            TypedQuery<KhoaHoc> query = session.createQuery(hql, KhoaHoc.class);
            query.setParameter("maCD", maCD);
            KhoaHoc = query.getSingleResult();
        }
        return KhoaHoc;
    }

    @Override
    public KhoaHoc save(KhoaHoc khoaHoc) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(khoaHoc);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                khoaHoc = null;
            }
            }finally {
            return khoaHoc;
        }

    }

    @Override
    public long delete(int maCD) {
        int result;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.beginTransaction();
            trans.begin();
            try {
             String hql = "DELETE KhoaHoc p WHERE p.maCD = :maCD";
             Query query = session.createQuery(hql);
                query.setParameter("maCD", maCD);
                result = query.executeUpdate();
                trans.commit();
            }catch (Exception e) {
                result =-1;
            }
        }
        return result;
    }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.maCD) FROM KhoaHoc p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
}
