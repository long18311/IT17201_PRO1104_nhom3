package Repositories;

import DomainModels.KhoaHoc;
import DomainModels.NguoiHoc;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;


public class NguoiHocRepository implements INguoiHocRepository {
    @Override
    public List<NguoiHoc> findAll() {
        List<NguoiHoc> NguoiHocs;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NguoiHoc p";
            TypedQuery<NguoiHoc> query = session.createQuery(hql, NguoiHoc.class);
            NguoiHocs = query.getResultList();
        }
        return NguoiHocs;
    }

    @Override
    public NguoiHoc findById(String maCD) {
        NguoiHoc nguoiHoc;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NguoiHoc p WHERE p.maCD = :maCD";
            TypedQuery<NguoiHoc> query = session.createQuery(hql, NguoiHoc.class);
            query.setParameter("maCD", maCD);
            nguoiHoc = query.getSingleResult();
        }
        return nguoiHoc;
    }

    @Override
    public NguoiHoc save(NguoiHoc nguoiHoc) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(nguoiHoc);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                nguoiHoc = null;
            }
        }finally {
            return nguoiHoc;
        }
    }

    @Override
    public long delete(String maNH) {
        int result;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE NguoiHoc p WHERE p.maNH = :maNH";
                Query query = session.createQuery(hql);
                query.setParameter("maNH", maNH);
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
                String statement = "SELECT COUNT(p.id) FROM NguoiHoc p";
                TypedQuery<Long> query = session.createQuery(statement, Long.class);
                total = query.getSingleResult();
            }
            return total;
    }

    @Override
    public List<NguoiHoc> findByten(String ten) {
        List<NguoiHoc> NguoiHocs;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NguoiHoc p WHERE p.hoTen = :hoTen";
            TypedQuery<NguoiHoc> query = session.createQuery(hql, NguoiHoc.class);
            query.setParameter("hoTen", ten);
            NguoiHocs = query.getResultList();
        }
        return NguoiHocs;
    }

}
