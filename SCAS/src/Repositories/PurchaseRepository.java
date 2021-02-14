/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Model.Purchase;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author georgeborsato
 */
public class PurchaseRepository extends GenericRepository<Purchase>{
    
    public List<Purchase> setPurchaseDate(Date dateInit, Date dateFinal){
        EntityManager em = getEntityManager();
        try{
            Query query = em.createQuery("SELECT p FROM Purchase p where p.saleDate BETWEEN :dateInit and :dateFinal");
            query.setParameter("dateInit", dateInit);
            query.setParameter("dateFinal", dateFinal);
            List<Purchase> purchases = query.getResultList();
            return purchases;
        }finally{
            em.close();
        }
    }
}
