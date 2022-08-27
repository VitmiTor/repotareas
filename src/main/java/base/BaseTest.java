package base;

import Utilities.Logs;
import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected final Logs logs = new Logs();
    protected final Faker faker = new Faker();
    protected final SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setupBase() {
        logs.info("Iniciando Base Test");
    }

    @AfterMethod
    public void teardownBase() {
        logs.info("Terminando BaseTest \n");
    }


}