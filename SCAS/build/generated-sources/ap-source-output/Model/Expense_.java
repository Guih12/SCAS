package Model;

import Model.CashRegister;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(Expense.class)
public class Expense_ { 

    public static volatile SingularAttribute<Expense, String> description;
    public static volatile SingularAttribute<Expense, CashRegister> cashRegister;
    public static volatile SingularAttribute<Expense, Integer> id;
    public static volatile SingularAttribute<Expense, Double> value;
    public static volatile SingularAttribute<Expense, Date> expirationDate;

}