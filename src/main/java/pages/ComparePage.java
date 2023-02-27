package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ComparePage {
    public ComparePage(Page page) {
        this.page = page;
    }

    Page page;

    private static final String H1 ="//h1[normalize-space()='Product Comparison']";

    public String MessageOfCompare(){
        return page.textContent(H1);
    }

}
