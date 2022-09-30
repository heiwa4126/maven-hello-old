package com.example.app;

/**
 * Hello world! and something
 */
import java.security.MessageDigest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    private static void test1() {
        // https://kaworu.jpn.org/java/Java%E3%81%A7SHA256%E3%82%92%E8%A8%88%E7%AE%97%E3%81%99%E3%82%8B
        String text = "hoge";
        byte[] cipher_byte;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());
            cipher_byte = md.digest();
            StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
            for (byte b : cipher_byte) {
                sb.append(String.format("%02x", b & 0xff));
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test2() throws JsonProcessingException {
        // https://qiita.com/opengl-8080/items/b613b9b3bc5d796c840c
        var hoge = new Hoge();
        hoge.id = 10;
        hoge.name = "hoge";

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(hoge);

        System.out.println(json);
    }

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello World!");
        test1();
        test2();
    }
}
