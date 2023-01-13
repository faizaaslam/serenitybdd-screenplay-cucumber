package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.user_interface.ProductCatalogPage;

public class ProductCatalog {
    public static TargetText itemName(){
        return TheTarget.textOf(ProductCatalogPage.Product_Catalog_Title);
    }

}
