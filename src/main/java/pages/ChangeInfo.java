package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ChangeInfo {
    public ChangeInfo(Page page) {
        this.page = page;
    }

    Page page;


    private static final String NewPassword = "//input[@placeholder='Password']";
    private static final String ConfirmNewPassword="//input[@placeholder='Password Confirm']";
    private static final String Button=("//input[@value='Continue']");
    private static final String Alert="//div[@class='alert alert-success alert-dismissible']";

    ///////////// Return The Text of The Alert
    public String AlertText(){
        return page.textContent(Alert);
    }


    /////////////////////////////////////////////////////////////////////////////////
    public void ChangeInformationAboutPassword(String password,String confirm){
        ActionsHelper.perform(page.locator(NewPassword), Locator::isVisible,e->e.fill(password));
        ActionsHelper.perform(page.locator(ConfirmNewPassword), e->e.isVisible(),e->e.fill(confirm));
        ActionsHelper.perform(page.locator(Button), e->e.isVisible(),Locator::click);


//        page.isVisible(NewPassword);
//        page.fill(NewPassword,password);
//        page.isVisible(ConfirmNewPassword);
//        page.fill(ConfirmNewPassword,confirm);
//        page.isVisible(Button);
//        page.click(Button);

    }
}
