/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author georgeborsato
 */
@Entity()
@Table(name = "produto")
public class Product implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id;
    
    @Column(name = "descricao", nullable = false, length = 144)
    private String description;
    
    @Column(name = "quantidade", nullable = false)
    private Integer quantity;
    @Column(name = "preco", nullable = false)
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<PurchaseItem> purchaseItems;
    
    public Product() {
    }

    public Product(String description, Integer quantity, Double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
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
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", description=" + description + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}
