package module2.training;

import java.util.Base64;

public class StringBufferApp {
    public static void main(String[] args) {
        String domain = ".ru";
        StringBuffer buffer = new StringBuffer("habrahabr");
        buffer.append(domain);
        System.out.println(buffer);
        buffer.delete(buffer.length() - domain.length(), buffer.length());
        System.out.println(buffer);
        buffer.insert(buffer.length(), domain);
        System.out.println(buffer);
    }
}
