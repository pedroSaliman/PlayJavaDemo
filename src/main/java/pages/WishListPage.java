package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class WishListPage {
    public WishListPage(Page page) {
        this.page = page;
    }

    Page page;


    private static final String message="//h2[normalize-space()='My Wish List']";
    private static final  String Remove="//i[@class='fa fa-times']";
    private static final  String Alert="//div[@class='alert alert-success alert-dismissible']";

    public String HeadMessage(){
        return page.textContent(message);
    }
    public void removeProduct(){
        ActionsHelper.perform(page.locator( Remove), Locator::isVisible,Locator::click);
//        page.isVisible(Remove);
//        page.click(Remove);


    }
    public Boolean alert(){
        page.isVisible(Alert);

        return true;
    }
}
