package Model;

import Model.PurchaseItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-02-08T13:37:44")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile ListAttribute<Product, PurchaseItem> purchaseItems;

}