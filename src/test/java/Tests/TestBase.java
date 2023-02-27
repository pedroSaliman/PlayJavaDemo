package Tests;

import Factory.managers.BrowserManager;
import Factory.managers.Navigate;
import com.github.javafaker.Faker;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Locale;

public class TestBase {

    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
@BeforeTest
    public void setup(){
    BrowserManager.initBrowser();
    Navigate.launchUrl();
}
@AfterTest
    public void TearDown(){

    BrowserManager.tearDown();
}
}
