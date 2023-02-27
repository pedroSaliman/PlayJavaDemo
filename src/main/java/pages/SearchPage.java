package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SearchPage {
    Page page;

    public SearchPage(Page page) {
        this.page = page;
    }

    private static final String WishLink="//a[normalize-space()='wish list']";
    private static final String Message="//h2[normalize-space()='Products meeting the search criteria']";
    private static final String ImageClick="//img[@title='iPhone']";
    private static final String AddToWishList="//div[@class='product-layout product-list col-xs-12']//button[2]";
    private static final String AddToCompareList="//button[@data-original-title='Compare this Product']";
    private static final String AlertCompare="//a[normalize-space()='product comparison']";

    //////////Compare
    public ComparePage CompareClick(){
        ActionsHelper.perform(page.locator(AddToCompareList), Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(AlertCompare), Locator::isVisible,Locator::click );


//        //   page.isVisible(AddToCompareList);
//        page.click(AddToCompareList);
//    //    page.isVisible(AlertCompare);
//        page.click(AlertCompare);

        return new ComparePage(page);
    }
    /////////////////////////////////////

    //  public static final SelenideElement Alert=$(".alert.alert-success.alert-dismissible");
    public String text(){
        return page.textContent(Message);
    }




    public WishListPage clickWish(){
        ActionsHelper.perform(page.locator(AddToWishList), Locator::isVisible,Locator::click );
        ActionsHelper.perform(page.locator(WishLink), Locator::isVisible,Locator::click );

//
//        page.isVisible(AddToWishList);
//        page.click(AddToWishList);
//        page.isVisible(WishLink);
//        page.click(WishLink);
        return new WishListPage(page);
    }

}
