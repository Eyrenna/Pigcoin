package walletTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;
import wallet.Wallet;

public class WalletTest {

    private Wallet wallet = null;

    @Before
    public void init() {
        wallet = new Wallet();
    }

    @Test
    public void contructorTest() {
        assertNotNull(wallet);
    }

    @Test
    public void generateKeyTest() {
        assertNotNull(wallet);
        wallet.generateKeyPair();
        assertNotNull(wallet.getAddress());
        assertNotNull(wallet.getSKey());

    }
}
