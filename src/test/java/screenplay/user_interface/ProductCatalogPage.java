package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductCatalogPage {

    public static Target Product_Catalog_Title = Target.the("product catalog page title")
            .locatedBy(".title");
}
