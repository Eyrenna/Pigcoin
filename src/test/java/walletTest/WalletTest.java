package wallet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;



import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class WalletTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void contructorTest() {
        Wallet wallet = new Wallet();
        assertNotNull.(wallet);
    }
}
