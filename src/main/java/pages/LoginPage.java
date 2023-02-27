package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {


    Page page;
    public LoginPage(Page page) {
        this.page = page;
    }

    private static final String Email="//input[@placeholder='E-Mail Address']";
    private static final String Password="//input[@placeholder='Password']";
    private static final String Button="//input[@value='Login']";


    //////////////////////////////////////////////

    public MyAccountPage LoginProcess(String email,String password){
        ActionsHelper.perform(page.locator(Email), Locator::isVisible,e->e.fill(email) );
        ActionsHelper.perform(page.locator(Password), Locator::isVisible,e->e.fill(password) );
        ActionsHelper.perform(page.locator(Button), Locator::isVisible,Locator::click );
//        page.isVisible(Email);
//        page.fill(Email,email);
//        page.isVisible(Password);
//        page.fill(Password,password);
//        page.isVisible(Button);
//        page.click(Button);

        return new MyAccountPage(page);


    }

}
