/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Model.Employee;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author georgeborsato
 */
public class LoginRepository extends GenericRepository<Employee>{
    
    public Employee EmployeeAuthenticate(String userLogin, String password){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.userLogin = :userLogin and e.password = :password", Employee.class);
            query.setParameter("userLogin", userLogin);
            query.setParameter("password", password);
            return query.getSingleResult();
              
        }catch(NoResultException ex){
            return null;
        }finally{
            em.close();
        }
    }
}
