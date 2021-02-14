
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity()
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class People implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "nome", nullable = false, length = 144)
    private String name;
    
    @Column(name = "idade", nullable = false)
    private int age;
    
    @Column(name = "cpf", nullable = false, length = 20)
    private String cpf;
    
    @Column(name = "numero_telefone", nullable = false, length = 20)
    private String phoneNumber;
    
    @Column(name = "endereco", nullable = false, length = 144)
    private String address;

    public People() {
    }

    public People(String name, int age,String cpf, String phoneNumber, String address) {
        this.name = name;
        this.age =  age;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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
        final People other = (People) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name=" + name + ", age=" + age + ", cpf=" + cpf + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }

   
    
    
    
    
    
}
