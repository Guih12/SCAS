package Model;

import Model.CashRegister;
import Model.Registration;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(MonthlyPayment.class)
public class MonthlyPayment_ { 

    public static volatile SingularAttribute<MonthlyPayment, Date> registrationDate;
    public static volatile SingularAttribute<MonthlyPayment, Registration> registration;
    public static volatile SingularAttribute<MonthlyPayment, CashRegister> cashRegister;
    public static volatile SingularAttribute<MonthlyPayment, Double> value;

}