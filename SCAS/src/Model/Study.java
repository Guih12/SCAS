
package Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class Study extends People{
    
    
    @OneToMany(mappedBy = "Study")
    private List<Registration> registrations;
    
    public Study() {
    }

    public Study(String name, int age, String cpf, String phoneNumber, String address) {
        super(name, age, cpf, phoneNumber, address);
    }

    

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
