package Repositories;

import DomainModels.ChuyenDe;
import DomainModels.Product;
import Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.util.List;

public class ChuyenDeRepository implements IChuyenDeRepository {
    @Override
    public List<ChuyenDe> findAll() {
        List<ChuyenDe> ChuyenDes;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM ChuyenDe p";
            TypedQuery<ChuyenDe> query = session.createQuery(hql, ChuyenDe.class);
            ChuyenDes = query.getResultList();
        }
        return ChuyenDes;
    }

    @Override
    public ChuyenDe findById(String maCD) {
        ChuyenDe chuyenDe;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM ChuyenDe p WHERE p.maCD = :maCD";
            TypedQuery<ChuyenDe> query = session.createQuery(hql, ChuyenDe.class);
            query.setParameter("maCD", maCD);
            chuyenDe = query.getSingleResult();
        }
        return chuyenDe;
    }

    @Override
    public ChuyenDe save(ChuyenDe chuyenDe) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.beginTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(chuyenDe);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                chuyenDe = null;
            }} finally {
            return chuyenDe;
        }

    }

    @Override
    public int delete(String maCD) {
        int id = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE ChuyenDe p WHERE p.maCD = :maCD";
                Query query = session.createQuery(hql);
                query.setParameter("maCD", maCD);
                int result = query.executeUpdate();
                if (result == 0) {
                    id = 0;
                }
                trans.commit();
            } catch (Exception e) {
                id = -1;
            }

        }
        return id;
    }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.maCD) FROM ChuyenDe p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
}
