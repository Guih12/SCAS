
package Repositories;

import Model.CashRegister;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class CashRegisterRepository extends GenericRepository<CashRegister>{
    
    public CashRegister isOpen(){
        EntityManager em = getEntityManager();
        Date date = new Date();
        try{
            Query query = em.createQuery("SELECT c from CashRegister c WHERE c.dateCashRegister = :date");
            query.setParameter("date", date);
            return (CashRegister) query.getSingleResult();
        }catch(NoResultException ex){
            return null;
        }
        finally{
            em.close();
        }
    }
}
