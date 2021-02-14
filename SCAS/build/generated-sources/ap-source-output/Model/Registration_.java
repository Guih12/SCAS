package Model;

import Enum.StatusRegistration;
import Enum.TypePayment;
import Model.Employee;
import Model.Study;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(Registration.class)
public class Registration_ { 

    public static volatile SingularAttribute<Registration, StatusRegistration> statusRegistration;
    public static volatile SingularAttribute<Registration, Study> study;
    public static volatile SingularAttribute<Registration, Double> rebate;
    public static volatile SingularAttribute<Registration, Date> dateRegistration;
    public static volatile SingularAttribute<Registration, Integer> id;
    public static volatile SingularAttribute<Registration, Employee> employee;
    public static volatile SingularAttribute<Registration, TypePayment> typePayment;

}