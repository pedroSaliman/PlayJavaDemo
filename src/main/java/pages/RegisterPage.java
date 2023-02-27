package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RegisterPage {


     Page page;
    public RegisterPage(Page page) {
        this.page = page;
    }
    private static final String fName=("//input[@id='input-firstname']");
    private static final String lName=("//input[@id='input-lastname']");
    private static final String Email=("//input[@id='input-email']");
    private static final String Telephone=("//input[@id='input-telephone']");
    private static final String Password=("//input[@id='input-password']");
    private static final String ConfirmPassword=("//input[@id='input-confirm']");
    private static final String Check=("//label[normalize-space()='Yes']");
    private static final String Privacy=("//input[@name='agree']");
    private static final String Button=("//input[@value='Continue']");


    public   MyAccountPage Register(String FirstName,String LastName,String email,String telephone,String password,String confirmPassword){
       ActionsHelper.perform(page.locator(fName), Locator::isVisible,e->e.fill(FirstName) );
        ActionsHelper.perform(page.locator(lName), Locator::isVisible,e->e.fill(LastName) );
        ActionsHelper.perform(page.locator(Email), Locator::isVisible,e->e.fill(email) );
        ActionsHelper.perform(page.locator(Telephone), Locator::isVisible,e->e.fill(telephone) );
        ActionsHelper.perform(page.locator(Password), Locator::isVisible,e->e.fill(password) );
        ActionsHelper.perform(page.locator(ConfirmPassword), Locator::isVisible,e->e.fill(confirmPassword) );
        ActionsHelper.perform(page.locator(Check), Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(Privacy), Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(Button), Locator::isVisible,Locator::click );

//        page.isVisible(fName);
//       page.fill(fName,FirstName);
//       page.isVisible(lName);
//       page.fill(lName,LastName);
//       page.isVisible(Email);
//       page.fill(Email,email);
//       page.isVisible(Telephone);
//       page.fill(Telephone,telephone);
//       page.isVisible(Password);
//       page.fill(Password,password);
//       page.isVisible(ConfirmPassword);
//       page.fill(ConfirmPassword,confirmPassword);
//       page.isVisible(Check);
//       page.click(Check);
//       page.isVisible(Privacy);
//       page.click(Privacy);
//       page.isVisible(Button);
//       page.click(Button);

        return new MyAccountPage(page);
    }
}
