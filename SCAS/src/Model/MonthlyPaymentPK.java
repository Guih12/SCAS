
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MonthlyPaymentPK implements Serializable{
    
    private int registration;
    private Date registrationDate;

    public MonthlyPaymentPK() {
    }

    public MonthlyPaymentPK(int registration, Date registrationDate) {
        this.registration = registration;
        this.registrationDate = registrationDate;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.registration;
        hash = 53 * hash + Objects.hashCode(this.registrationDate);
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
        final MonthlyPaymentPK other = (MonthlyPaymentPK) obj;
        if (this.registration != other.registration) {
            return false;
        }
        if (!Objects.equals(this.registrationDate, other.registrationDate)) {
            return false;
        }
        return true;
    }
    
    
}
