package Model;

import Model.Product;
import Model.Purchase;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(PurchaseItem.class)
public class PurchaseItem_ { 

    public static volatile SingularAttribute<PurchaseItem, Product> product;
    public static volatile SingularAttribute<PurchaseItem, Integer> quantity;
    public static volatile SingularAttribute<PurchaseItem, Double> price;
    public static volatile SingularAttribute<PurchaseItem, Purchase> purchase;
    public static volatile SingularAttribute<PurchaseItem, Integer> id;

}