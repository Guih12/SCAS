
package Repositories;

import Model.Personal;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class PersonalRepository extends GenericRepository<Personal>{
    
    public Personal findByOne(int id){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Personal> query = em.createQuery("Select p from Personal p where p.id = :id", Personal.class);
            query.setParameter("id", id);
            Personal personal = query.getSingleResult();
            return personal;
            
        }catch(NoResultException ex){
            return null;
        }finally{
            em.close();
        }
    }
}
