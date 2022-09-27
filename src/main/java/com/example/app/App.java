package com.example.app;
/**
 * Hello world!
 *
 */
import java.security.MessageDigest;

public class App
{
    private static void test1() {
        String text = "hoge";
        byte[] cipher_byte;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            cipher_byte = md.digest();
            StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
            for(byte b: cipher_byte) {
                sb.append(String.format("%02x", b&0xff) );
            }
            System.out.println( sb );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        test1();
    }
}
