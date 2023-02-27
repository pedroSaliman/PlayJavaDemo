package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class EditAccount {
    Page page;

    public EditAccount(Page page) {
        this.page = page;
    }

    private static final String fName="//input[@id='input-firstname']";
    private static final String Button="//input[@value='Continue']";
    private static final String Success="//div[@class='alert alert-success alert-dismissible']";

    public void editInfo(String FirstName){
        ActionsHelper.perform(page.locator(fName), Locator::isVisible,e->e.fill(FirstName) );
        ActionsHelper.perform(page.locator(Button), Locator::isVisible,Locator::click);
//        page.isVisible(fName);
//        page.fill(fName,FirstName);
//        page.isVisible(Button);
//        page.click(Button);
//        page.isVisible(Success);

    }
    public String MessageOfAlertToUpdateMyAccount(){
        return page.textContent(Success);
    }

}
