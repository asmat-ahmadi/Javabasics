package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigReader01 {
    public static void main(String[] args) throws InterruptedException {
        String URL="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="admin";
        String password="Hum@nhrm123";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get(URL);
        WebElement userNameFiled=driver.findElement(By.id("txtUsername"));
        userNameFiled.sendKeys(userName);
        WebElement password1=driver.findElement(By.id("txtPassword"));
        password1.sendKeys(password);
        WebElement button=driver.findElement(By.id("btnLogin"));
        button.click();
    }
}
