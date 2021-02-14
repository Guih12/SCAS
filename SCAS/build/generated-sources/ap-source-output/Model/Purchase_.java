package Model;

import Enum.TypePayment;
import Model.CashRegister;
import Model.PurchaseItem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(Purchase.class)
public class Purchase_ { 

    public static volatile SingularAttribute<Purchase, Double> amount;
    public static volatile SingularAttribute<Purchase, CashRegister> cashRegister;
    public static volatile SingularAttribute<Purchase, Integer> id;
    public static volatile SingularAttribute<Purchase, Date> saleDate;
    public static volatile ListAttribute<Purchase, PurchaseItem> purchaseItems;
    public static volatile SingularAttribute<Purchase, TypePayment> typePayment;

}