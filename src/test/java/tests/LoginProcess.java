package tests;

import org.testng.annotations.Test;
import reusable.Implementation;

public class LoginProcess {
@Test
    public void loginProcess(){

        Implementation implementation=new Implementation();
        implementation.navigateToApplication();
        implementation.loginPage();
        implementation.closeDriver();
    }
}
