/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Enum.TypePayment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author georgeborsato
 */

@Entity()
@Table(name = "compra")
public class Purchase implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer id;
    
    @Column(name = "valor_total", nullable = false)
    private double amount;
    
    @Column(name = "data_venda", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date saleDate;
    
    @Column(name = "tipo_pagamento", nullable = false, length = 45)
    private TypePayment typePayment;
    
    @ManyToOne()
    @JoinColumn(name = "data_caixa", nullable = false, referencedColumnName = "data_caixa")
    private CashRegister cashRegister;
    
    @OneToMany(mappedBy = "purchase", cascade = CascadeType.PERSIST)
    private List<PurchaseItem> purchaseItems = new ArrayList<>();

    public Purchase() {
    }

    public Purchase(TypePayment typePayment, CashRegister cashRegister) {
        this.amount = this.valueTotal();
        this.saleDate = new Date();
        this.typePayment = typePayment;
        this.cashRegister = cashRegister;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void addItems(PurchaseItem purchaseItem) {
        this.purchaseItems.add(purchaseItem);
    }
    
    
    public PurchaseItem listItems(){
        for(PurchaseItem pu : this.purchaseItems){
            return pu;
        }
        return null;
    }
    
    private double valorAtt(){
        double sub = 0.00;
        for(PurchaseItem i : this.purchaseItems){
            sub+= i.subTotal();
        }
        return sub;
    }

   public double valueTotal(){
       return this.valorAtt();
   }
   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
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
        final Purchase other = (Purchase) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", amount=" + amount + ", saleDate=" + saleDate + ", typePayment=" + typePayment + ", cashRegister=" + cashRegister + ", purchaseItems=" + purchaseItems + '}';
    }
    
    
   
}
