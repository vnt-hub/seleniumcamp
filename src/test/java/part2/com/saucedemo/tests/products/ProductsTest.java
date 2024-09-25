package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductPage productPage = loginPage.
                logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductsHeaderDisplayed(),
                "\n Products Header Is Not Displayed \n");
    }
}
