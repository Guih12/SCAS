/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author georgeborsato
 */
public class ProductRepository extends GenericRepository<Product>{
    
    public Product getProductPK(int cod){
        EntityManager em = getEntityManager();
 
        try{
            TypedQuery<Product> query = em.createQuery("Select p from Product p where p.id = :cod", Product.class);
            query.setParameter("cod", cod);
            Product product = query.getSingleResult();
            return product;
            
        }catch(NoResultException ex){
            return null;
        }finally{
            em.close();
        }
    }
    
    public List<Product> searchDescriptionProduct(String description){
        EntityManager em = getEntityManager();
        try{
            
             TypedQuery<Product> query = em.createQuery("Select p from Product p where p.description LIKE :description", Product.class); 
             query.setParameter("description", "%"+description+"%");
             List<Product> products  = query.getResultList();
             return products;
        }catch(NoResultException e){
            return null;
        }finally{
            em.close();
        }
    }
}
