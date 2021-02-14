
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity()
@Table(name = "caixa")
public class CashRegister implements Serializable{
    
    
    @Id
    @Column(name = "data_caixa", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateCashRegister;
    
    @Column(name = "valor_abertura", nullable = false, precision = 10, scale = 2)
    private double apertureValue;
    
    @Column(name = "valor_fechamento", nullable = true, precision = 10, scale = 2)
    private double closingValue;
    
    @Column(name = "valor_entrada", nullable = true, precision = 10, scale = 2)
    private double inputValue;
    
    @Column(name = "valor_saida", nullable = true, precision = 10, scale = 2)
    private double outputValue;
   
   
   @OneToMany(mappedBy = "cashRegister")
   private List<Expense> expenses;
   
   
   @OneToMany(mappedBy = "cashRegister")
   private List<MonthlyPayment> monthlyPayments;

    public CashRegister() {
    }

    public CashRegister(Date dateCashRegister, double apertureValue, double closingValue, double inputValue, double outputValue) {
        this.dateCashRegister = dateCashRegister;
        this.apertureValue = apertureValue;
        this.closingValue = closingValue;
        this.inputValue = inputValue;
        this.outputValue = outputValue;
    }

    public Date getDateCashRegister() {
        return dateCashRegister;
    }

    public void setDateCashRegister(Date dateCashRegister) {
        this.dateCashRegister = dateCashRegister;
    }

    public double getApertureValue() {
        return apertureValue;
    }

    public void setApertureValue(double apertureValue) {
        this.apertureValue = apertureValue;
    }

    public double getClosingValue() {
        return closingValue;
    }

    public void setClosingValue(double closingValue) {
        this.closingValue = closingValue;
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public double getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(double outputValue) {
        this.outputValue = outputValue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.dateCashRegister);
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
        final CashRegister other = (CashRegister) obj;
        if (!Objects.equals(this.dateCashRegister, other.dateCashRegister)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CashRegister{" + "dateCashRegister=" + dateCashRegister + ", apertureValue=" + apertureValue + ", closingValue=" + closingValue + ", inputValue=" + inputValue + ", outputValue=" + outputValue + '}';
    }

    public void getDateCashRegister(Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
