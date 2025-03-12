package daoImpl;

import dao.ParentDao;
import models.Parent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ParentDaoImp implements ParentDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");

    @Override
    public void save(Parent parent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(parent);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Parent findById(Long id) {
        EntityManager em = emf.createEntityManager();
        Parent parent = em.find(Parent.class, id);
        em.close();
        return parent;
    }

    @Override
    public List<Parent> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Parent> parents = em.createQuery("SELECT p FROM Parent p", Parent.class).getResultList();
        em.close();
        return parents;
    }

    @Override
    public void update(Parent parent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(parent);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Parent parent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(parent) ? parent : em.merge(parent));
        em.getTransaction().commit();
        em.close();
    }
}