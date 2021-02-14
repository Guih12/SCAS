
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity()
@Table(name = "mensalidade")
@IdClass(MonthlyPaymentPK.class)
public class MonthlyPayment implements Serializable{
    
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_matricula", nullable = false, referencedColumnName = "id_matricula")
    private Registration registration;
    
    @Id
    @Column(name = "data_mensalidade", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    
    @Column(name = "valor", nullable = false)
    private double value;
    
    @ManyToOne()
    @JoinColumn(name = "data_caixa", nullable = true, referencedColumnName = "data_caixa")
    private CashRegister cashRegister;

    public MonthlyPayment() {
    }

    public MonthlyPayment(Registration registration, Date registrationDate, double value, CashRegister cashRegister) {
        this.registration = registration;
        this.registrationDate = registrationDate;
        this.value = value;
        this.cashRegister = cashRegister;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.registration);
        hash = 97 * hash + Objects.hashCode(this.registrationDate);
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
        final MonthlyPayment other = (MonthlyPayment) obj;
        if (!Objects.equals(this.registration, other.registration)) {
            return false;
        }
        if (!Objects.equals(this.registrationDate, other.registrationDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonthlyPayment{" + "registration=" + registration + ", registrationDate=" + registrationDate + ", value=" + value + ", cashRegister=" + cashRegister + '}';
    }
    
    
}
