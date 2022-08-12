package tests;
import org.testng.annotations.Test;
import reusable.Implementation;

public class Test1 {
    @Test
    public void test1() {
        Implementation implementation=new Implementation();
        implementation.navigateToApplication();
        implementation.closeDriver();
      //  Assert.assertEquals("Hello", "Hello");
      //  System.out.println("Hello world!");

    }
}
