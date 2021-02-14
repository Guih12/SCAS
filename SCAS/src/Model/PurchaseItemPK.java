
package Model;

import java.io.Serializable;


public class PurchaseItemPK implements Serializable{
    
    private Integer purchase;
    private Integer  id;
    private Integer product;

    public PurchaseItemPK() {
    }

    public PurchaseItemPK(Integer purchase, Integer id, Integer product) {
        this.purchase = purchase;
        this.id = id;
        this.product = product;
    }

    

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.purchase;
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PurchaseItemPK other = (PurchaseItemPK) obj;
        if (this.purchase != other.purchase) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
