/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author georgeborsato
 */

@Entity()
@Table(name = "item_compra")
@IdClass(PurchaseItemPK.class)
public class PurchaseItem implements Serializable{
    
    
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra")
    private Purchase purchase;
    
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_produto")
    private Product product;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemVenda")
    private Integer id;
   
    @Column(name = "quantidade", nullable = false)
    private int quantity;
    @Column(name = "preco", nullable = false, precision = 10, scale = 2)
    private double price;
    
    

    public PurchaseItem() {
    }

    public PurchaseItem(int quantity, Product product) {
        this.id = product.getId();
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    
    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }
    
    
}
