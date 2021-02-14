
package Model;

import Enum.TypeEmployee;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity()
@Table(name = "funcionario")
public class Employee extends People{
    
    @Column(name = "tipo_funcionario", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private TypeEmployee typeEmployee;
    
    @Column(name = "user_login", nullable = false, length = 50)
    private String userLogin;
    
    @Column(name = "senha", nullable = false, length = 144)
    private String password;
    
    @OneToMany(mappedBy = "employee")
    private List<Registration> registrations;
    
    
    
    public Employee() {
    }

    public Employee(TypeEmployee typeEmployee, String userLogin, String password, String name, int age, String cpf, String phoneNumber, String address) {
        super(name, age, cpf, phoneNumber, address);
        this.typeEmployee = typeEmployee;
        this.userLogin = userLogin;
        this.password = password;
    }

   


    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
    
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.typeEmployee);
        return hash;
    }


    @Override
    public String toString() {
        return "Employee{" + "typeEmployee=" + typeEmployee + ", password=" + password + '}';
    }

}
