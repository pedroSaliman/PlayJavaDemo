package Factory;

import Factory.config.FrameWorkConfig;
import Factory.managers.PlayManager;
import com.microsoft.playwright.*;
import org.aeonbits.owner.ConfigFactory;

import java.nio.file.Paths;
import java.util.Base64;

public class FactoryInit {
    /*
    *
    *
    *
    * BEFORE FUNCTIONAL PROGRAMING
    *
    *
    *
    *
    *
    *
    *
    * */
//    Playwright playwright;
//    Browser browser;
//    BrowserContext browserContext;
//    Page page;
//    FrameWorkConfig config;
//    /////////////Threads///////////////
//  private static   ThreadLocal<Browser> thBrowser=new ThreadLocal<>();
//    private static    ThreadLocal<BrowserContext>thContext =new ThreadLocal<>();
//    private static  ThreadLocal<Page> thPage=new ThreadLocal<>();
//    private static  ThreadLocal<Playwright> thPlay=new ThreadLocal<>();
//
//    public static Browser getThBrowser() {
//        return thBrowser.get();
//    }
//
//    public static BrowserContext getThContext() {
//        return thContext.get();
//    }
//
//    public static Page getThPage() {
//        return thPage.get();
//    }
//
//    public static Playwright getThPlay() {
//        return thPlay.get();
//    }
//
//
//
//
//
//
//
//    public Page init(String browserName){
//        config= ConfigFactory.create(FrameWorkConfig.class);
//
//       // playwright=Playwright.create();
//        thPlay.set(Playwright.create());
//        switch (browserName){
//            case "chromium":
//              //browser=  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//                thBrowser.set(getThPlay().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
//              break;
//            case "firefox":
//            //    browser=  playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
//                thBrowser.set(getThPlay().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
//                break;
//            default:
//                System.out.println("Enter Your Browser");
//
//
//        }
//        thContext.set(getThBrowser().newContext());
//        thPage.set(getThContext().newPage());
//        getThPage().navigate(config.url());
//         return getThPage();
//    }
//
//
//
//




    public static String takeScreenshot() {
        String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
        //getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));

        byte[] buffer = PlayManager.getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
        String base64Path = Base64.getEncoder().encodeToString(buffer);

        return base64Path;
    }


}
