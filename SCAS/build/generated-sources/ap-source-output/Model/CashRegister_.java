package Model;

import Model.Expense;
import Model.MonthlyPayment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(CashRegister.class)
public class CashRegister_ { 

    public static volatile SingularAttribute<CashRegister, Double> apertureValue;
    public static volatile SingularAttribute<CashRegister, Date> dateCashRegister;
    public static volatile SingularAttribute<CashRegister, Double> closingValue;
    public static volatile SingularAttribute<CashRegister, Double> outputValue;
    public static volatile SingularAttribute<CashRegister, Double> inputValue;
    public static volatile ListAttribute<CashRegister, MonthlyPayment> monthlyPayments;
    public static volatile ListAttribute<CashRegister, Expense> expenses;

}