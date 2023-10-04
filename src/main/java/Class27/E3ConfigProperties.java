package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"/file/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);

       /* String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="Hum@nhrm123";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement usernameField=driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys(userName);
        WebElement passField=driver.findElement(By.id("txtPassword"));
        passField.sendKeys(password);
        WebElement button=driver.findElement(By.id("btnLogin"));
        button.click();*/
        String value=getProperty("");
        System.out.println(value);

    }
    public static String getProperty(String propKey) throws IOException {
        String path=System.getProperty("user.dir")+"/file/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        String value=prop.getProperty(propKey);
        return value;
    }
}
