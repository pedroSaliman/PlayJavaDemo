package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MyAccountPage {

    Page page;
    public MyAccountPage(Page page) {
        this.page = page;
    }

    private static final String H2="//h2[normalize-space()='My Account']";
    private static final String H1="//h1[normalize-space()='Your Account Has Been Created!']";
    private static final String EditInfo="//a[normalize-space()='Edit Account']";
    private static final String Search="//input[@placeholder='Search']";
    private static final String ChangePassword="//a[normalize-space()='Password']";

    public String MessageOfHeader(){return page.textContent(H2);}
    public ChangeInfo change(){
        ActionsHelper.perform(page.locator(ChangePassword), Locator::isVisible, Locator::click);

//        page.isVisible(ChangePassword);
//        page.click(ChangePassword);

        return new ChangeInfo(page);
    }
    public String  message(){
        return page.textContent(H1);
    }
    // Edit Information
    public EditAccount edit(){
        ActionsHelper.perform(page.locator(EditInfo), Locator::isVisible, Locator::click);
//
//        page.isVisible(EditInfo);
//        page.click(EditInfo);

        return new EditAccount(page);
    }


    // Search For Product
    public SearchPage search(String product){
//        page.isVisible(Search);
//        page.fill(Search,product);
//        page.keyboard().press("Enter");
        ActionsHelper.perform(page.locator(Search), Locator::isVisible, e->e.fill(product));
        page.keyboard().press("Enter");

        return new SearchPage(page);
    }
}
