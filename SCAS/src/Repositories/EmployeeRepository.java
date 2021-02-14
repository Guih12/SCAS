
package Repositories;

import Model.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;



public class EmployeeRepository extends GenericRepository<Employee>{
    
    
    public Employee getEmployeePK(int cod){
        EntityManager em = getEntityManager();
        try{
            
             TypedQuery<Employee> query = em.createQuery("Select e from Employee e where e.id = :cod", Employee.class); 
             query.setParameter("cod", cod);
             return query.getSingleResult();
        }catch(NoResultException e){
            return null;
        }finally{
            em.close();
        }
    }
  
    public List<Employee> searchEmployee(String name){
        EntityManager em = getEntityManager();
        try{
            
             TypedQuery<Employee> query = em.createQuery("Select e from Employee e where e.name LIKE :name", Employee.class); 
             query.setParameter("name", "%"+name+"%");
             List<Employee> employees  = query.getResultList();
             return employees;
        }catch(NoResultException e){
            return null;
        }finally{
            em.close();
        }
    }
}
