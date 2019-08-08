package Networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlconnection = url.openConnection();
            InputStream stream = urlconnection.getInputStream();
            int i;
            while((i = stream.read()) != -1) {
                System.out.println((char)i);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
