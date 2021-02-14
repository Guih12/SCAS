
package Model;

import Enum.StatusRegistration;
import Enum.TypePayment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity()
@Table(name = "matricula")
public class Registration implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private int id;
    
    @Column(name = "data_matricula", nullable = false, length = 45)
    @Temporal(TemporalType.DATE)
    private Date dateRegistration;
    
    
    @Column(name = "valor_matricula", nullable = false, precision = 10, scale = 2)
    private Double value;
    
    @Column(name = "tipo_pagamento", nullable = false, length = 45)
    @Enumerated(EnumType.STRING)
    private TypePayment typePayment;
    
    @Column(name = "desconto", nullable = true, precision = 10, scale = 2)
    private double rebate;
    
    
    @OneToMany(mappedBy = "registration", cascade = CascadeType.PERSIST)
    private List<MonthlyPayment> monthlyPayments = new ArrayList<>();
    
    
    @ManyToOne()
    @JoinColumn(name = "id_aluno", nullable = false, referencedColumnName = "id")
    private Study study;
    
    @ManyToOne()
    @JoinColumn(name = "id_funcionario", nullable = false, referencedColumnName = "id")
    private Employee employee;

    public Registration() {
    }

    public Registration(Date dateRegistration, Double value, TypePayment typePayment, double rebate, Study study, Employee employee) {
        this.dateRegistration = dateRegistration;
        this.value = value;
        this.typePayment = typePayment;
        this.rebate = rebate;
        this.study = study;
        this.employee = employee;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }

    public double getRebate() {
        return rebate;
    }

    public void setRebate(double rebate) {
        this.rebate = rebate;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<MonthlyPayment> getMonthlyPayments() {
        return monthlyPayments;
    }
    
    public void addMonthlyPayment(MonthlyPayment monthlyPayment){
        this.monthlyPayments.add(monthlyPayment);
    }

    public void setMonthlyPayments(List<MonthlyPayment> monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Registration other = (Registration) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Registration{" + "id=" + id + ", dateRegistration=" + dateRegistration + ", value=" + value + ", typePayment=" + typePayment + ", rebate=" + rebate + ", monthlyPayments=" + monthlyPayments + ", study=" + study + ", employee=" + employee + '}';
    }

    
}
