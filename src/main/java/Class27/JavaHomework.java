package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaHomework {
    public static void main(String[] args) throws IOException {
        String path="/Users/habib/IdeaProjects/Java basics/Files/facebook.chrome";
        FileInputStream fis =new FileInputStream(path);
        Properties pro= new Properties();
        pro.load(fis);
        System.out.println(pro.getProperty("browser"));
        System.out.println(pro.getProperty("url"));
        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("password"));
    }
}
