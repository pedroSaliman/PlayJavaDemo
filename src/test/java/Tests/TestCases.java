package Tests;

import Factory.config.ConfigClass;
import Factory.managers.PlayManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends TestBase{
    @Test
    public void registerInfo(){
        new Home(PlayManager.getPage()).registerClick().Register(ConfigClass.getConfig().fname(), ConfigClass.getConfig().lname(), email, ConfigClass.getConfig().telephone(), ConfigClass.getConfig().password(), ConfigClass.getConfig().confirm());
      Assert.assertEquals("Your Account Has Been Created!",new MyAccountPage(PlayManager.getPage()).message());
;
    }


    @Test(dependsOnMethods = {"registerInfo"})
    public void LoginCase(){
        new Home(PlayManager.getPage())
                .logout().LoginProcess(email, ConfigClass.getConfig().password());
        Assert.assertEquals("My Account",new MyAccountPage(PlayManager.getPage()).MessageOfHeader());
    }
    @Test(dependsOnMethods = {"LoginCase"})
    public void EditAccountCase(){
        new MyAccountPage(PlayManager.getPage()).edit().editInfo(ConfigClass.getConfig().fname());
        Assert.assertEquals(" Success: Your account has been successfully updated.", new EditAccount(PlayManager.getPage()).MessageOfAlertToUpdateMyAccount());

    }
    @Test(dependsOnMethods = {"EditAccountCase"})

    public void ChangePass(){
        new MyAccountPage(PlayManager.getPage()).change().ChangeInformationAboutPassword(ConfigClass.getConfig().changepassword(), ConfigClass.getConfig().changepassword());
        Assert.assertEquals(" Success: Your password has been successfully updated.",new ChangeInfo(PlayManager.getPage()).AlertText());
    }
    @Test(dependsOnMethods = {"ChangePass"})
    public void SearchCaseCompare(){
        new MyAccountPage(PlayManager.getPage()).search(ConfigClass.getConfig().product()).CompareClick();
        Assert.assertEquals(new ComparePage(PlayManager.getPage()).MessageOfCompare(),"Product Comparison");
        new MyAccountPage(PlayManager.getPage()).search(ConfigClass.getConfig().anotherproduct()).CompareClick();
        Assert.assertEquals(new ComparePage(PlayManager.getPage()).MessageOfCompare(),"Product Comparison");
    }

}
