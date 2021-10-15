import org.testng.Assert;
import org.testng.annotations.Test;

public class mathTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Math.sum(10, 20), 30);
        Assert.assertEquals(Math.sum(0, 0), 0);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(Math.div(20, 10), 2);
        Assert.assertEquals(Math.div(5, 2), 2.5);
    }
}
