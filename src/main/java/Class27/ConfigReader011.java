package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader011 {
    public static void main(String[] args) throws InterruptedException, IOException {
       /* String path=System.getProperty("user.dir")+"/Files/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get(URL);
        WebElement userNameFiled=driver.findElement(By.id("txtUsername"));
        userNameFiled.sendKeys(userName);
        WebElement password1=driver.findElement(By.id("txtPassword"));
        password1.sendKeys(password);
        WebElement button=driver.findElement(By.id("btnLogin"));
        button.click();*/
        String value=getPrpperty("password");
        System.out.println(value);

    }
    public static String getPrpperty(String propKey) throws IOException{
        String path=System.getProperty("user.dir")+"/Files/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        String value=prop.getProperty(propKey);
        return value;
    }
}
