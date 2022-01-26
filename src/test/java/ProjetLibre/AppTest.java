package ProjetLibre;
import org.testng.Assert;
import org.testng.annotations.Test;

// Avec TestNG
public class AppTest {
    // the user and pass should match the ones in config file
    @Test
    public void testlogin1()
    {
        App myApp = new App();
        Assert.assertEquals(0, myApp.userLogin("Houmam", "Scafold#80"));
    }
    @Test
    public void testlogin2()
    {
        App myApp = new App();
        Assert.assertEquals(1, myApp.userLogin("DevOps", "AS3@B_motdepa$$eHow@Hada!?"));
    }
}
