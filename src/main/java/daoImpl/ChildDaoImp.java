package daoImpl;

import dao.ChildDao;
import models.Child;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ChildDaoImp implements ChildDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");

    @Override
    public void save(Child child) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(child);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Child findById(Long id) {
        EntityManager em = emf.createEntityManager();
        Child child = em.find(Child.class, id);
        em.close();
        return child;
    }

    @Override
    public List<Child> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Child> children = em.createQuery("SELECT c FROM Child c", Child.class).getResultList();
        em.close();
        return children;
    }

    @Override
    public void update(Child child) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(child);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Child child) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(child) ? child : em.merge(child));
        em.getTransaction().commit();
        em.close();
    }
}