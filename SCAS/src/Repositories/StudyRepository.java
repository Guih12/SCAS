/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Model.Registration;
import Model.Study;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author georgeborsato
 */
public class StudyRepository extends GenericRepository<Study>{
    
    
    public List<Study> seachStudies(String name){
        EntityManager em = getEntityManager();
        try{
            
             TypedQuery<Study> query = em.createQuery("Select s from Study s where s.name LIKE :name", Study.class); 
             query.setParameter("name", "%"+name+"%");
             List<Study> studies  = query.getResultList();
             return studies;
        }catch(NoResultException e){
            return null;
        }finally{
            em.close();
        }
      }
  
 }
