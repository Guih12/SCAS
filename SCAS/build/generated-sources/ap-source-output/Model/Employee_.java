package Model;

import Enum.TypeEmployee;
import Model.Registration;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(Employee.class)
public class Employee_ extends People_ {

    public static volatile SingularAttribute<Employee, String> userLogin;
    public static volatile SingularAttribute<Employee, String> password;
    public static volatile ListAttribute<Employee, Registration> registrations;
    public static volatile SingularAttribute<Employee, TypeEmployee> typeEmployee;

}