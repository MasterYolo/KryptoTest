/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author Mikey
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // TODO code application logic here

        KeyGenerator kg = KeyGenerator.getInstance("AES");
        SecretKey sk;

        kg.init(128);
        sk = kg.generateKey();
        System.out.print("AES 128 - ");
        System.out.println(Hex.encodeHex(sk.getEncoded()));

        kg.init(192);
        sk = kg.generateKey();
        System.out.print("AES 192 - ");
        System.out.println(Hex.encodeHex(sk.getEncoded()));

        kg.init(256);
        sk = kg.generateKey();
        System.out.print("AES 256 - ");
        System.out.println(Hex.encodeHex(sk.getEncoded()));

    }

}
