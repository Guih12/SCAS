
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity()
@Table(name = "personal")
public class Personal extends People{
    
    @Column(name = "cref", nullable = false, length = 30)
    private String cref;
    @Column(name = "taxa", nullable = false, precision = 10, scale = 2)
    private double tarrif;

    public Personal() {
    }

    public Personal(String cref, double tarrif, String name, int age, String cpf, String phoneNumber, String address) {
        super(name, age, cpf, phoneNumber, address);
        this.cref = cref;
        this.tarrif = tarrif;
    }

    

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Double getTarrif() {
        return tarrif;
    }

    public void setTarrif(Double tarrif) {
        this.tarrif = tarrif;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Personal" + "cref=" + cref + ", tarrif=" + tarrif + '}'; //To change body of generated methods, choose Tools | Templates.
    }
  
}
