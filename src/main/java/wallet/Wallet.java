package wallet;

import genSig.GenSig;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {

    //Atributos
    private PublicKey address = null;
    private PrivateKey sKey = null;

    //Constructor

    public Wallet() {}

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setSKey(PrivateKey sKey) {
        this.sKey = sKey;
    }


    //Métodos
    public PublicKey getAddress() {
        return address;
    }

    public PrivateKey getSKey() {
        return sKey;
    }

    public void generateKeyPair() {
        setAddress(GenSig.generateKeyPair().getPublic());
        setSKey(GenSig.generateKeyPair().getPrivate());
    }

}
