package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader03 {
    public static void main(String[] args) throws IOException {
        //locate the file below
        //String path="/Users/habib/IdeaProjects/Java basics/Files/Config.properties";
        String path=System.getProperty("user.dir")+"/Files/Config.properties"; // this key is concatenate file in differernt pc
        System.out.println(path);
        // follwoing keys is to bring files from permenent storage to temporay to work on it .
        FileInputStream fis=new FileInputStream(path);
        // this key is assisting us to read and write the date on file
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.get("password"));// this sout is printing us the values of the our file
        System.out.println(System.getProperty("user.dir")); // this key is shoiwng the directory part of your file in your pc

    }
}
