/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author georgeborsato
 */

@Entity()
@Table(name = "despesa")
public class Expense implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despesa")
    private Integer id;
    
    @Column(name = "descricao", nullable = false, length = 144)
    private String description;
    
    @Column(name = "data_despesa")
    @Temporal(TemporalType.DATE)
    private Date expenseDate;
    
    @Column(name = "valor", nullable = false,  precision = 10, scale = 2)
    private double value;
    
    @ManyToOne()
    @JoinColumn(name = "data_caixa", nullable = false, referencedColumnName = "data_caixa")
    private CashRegister cashRegister;

    public Expense() {
    }

    public Expense(String description, Date expenseDate, double value, CashRegister cashRegister) {
        this.description = description;
        this.expenseDate = expenseDate;
        this.value = value;
        this.cashRegister = cashRegister;
    }

    public Integer getId() {
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

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
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
        final Expense other = (Expense) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expense{" + "id=" + id + ", description=" + description + ", expenseDate=" + expenseDate + ", value=" + value + ", cashRegister=" + cashRegister + '}';
    }
}
