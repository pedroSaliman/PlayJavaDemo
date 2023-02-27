package Factory.managers;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Playwright;

public class BrowserManager {
    public static void initBrowser() {
        Playwright playwright = PlayManager.getPlaywrightInstance();
        BrowserContext browserContext = BrowserFactory.getBrowserContext(playwright);
        PlayManager.setBrowserContext(browserContext);
    }

    public static void tearDown() {
        PlayManager.cleanUp();
    }
}

