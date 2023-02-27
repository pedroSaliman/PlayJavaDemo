package pages;


import com.microsoft.playwright.*;

public class Home {
    Page page;


///////////////////////////////////////////////////////
    private static final     String MyAccount ="//span[normalize-space()='My Account']";
    private static final    String Register ="//a[normalize-space()='Register']";
    private static final    String Logout="li:has-text('My Account My Account Order History Transactions Downloads Logout') >> role=link[name='Logout']";
    private static final    String LoginButton="li:has-text('My Account Register Login') >> role=link[name='Login']";

  public    Home(Page page) {
        this.page = page;
    }
    public  RegisterPage registerClick(){
        ActionsHelper.perform(page.locator(MyAccount),Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(Register),Locator::isVisible,Locator::click );

//        page.isVisible(MyAccount);
//        page.click(MyAccount);
//    page.isVisible(Register);
//       page.click(Register);

        return new RegisterPage(page);
    }
    public LoginPage logout(){
        ActionsHelper.perform(page.locator(MyAccount),Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(Logout),Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(MyAccount),Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(LoginButton),Locator::isVisible,Locator::click );
//          page.isVisible( MyAccount);
//          page.click(MyAccount);
//             page.isVisible(Logout);
//             page.click(Logout);
//        page.isVisible( MyAccount);
//        page.click(MyAccount);
//              page.isVisible(LoginButton);
//              page.click(LoginButton);

        return new LoginPage(page);
    }







}
