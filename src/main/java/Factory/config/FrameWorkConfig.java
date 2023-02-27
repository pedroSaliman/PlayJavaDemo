package Factory.config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();
    String theemail();
    String telephone();
    String password();
    String confirm();
    String product();
    String changepassword();
    String anotherproduct();
    String theotheremail();
    String browser();
    boolean headless();
}
