/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author georgeborsato
 */
public abstract class GenericRepository<T> {
    
    private EntityManagerFactory entityManagerFactory;
    private Class classe;

    public GenericRepository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("SCASPU");
        ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
         this.classe = ((Class) pt.getActualTypeArguments()[0]);
    }
    
    protected EntityManager getEntityManager(){
        return this.entityManagerFactory.createEntityManager();
    }
    
    public void insert(T entity){
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public List<T> getAll(){
        EntityManager entityManager = getEntityManager();
        try{
            return entityManager.createQuery("select e from " + this.classe.getName()+ " e").getResultList();
        }finally{
            entityManager.close();
        }
    }
    
    public void update(T entity){
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
     public void delete(T entity){
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.merge(entity));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
