package class20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class E5Selenium {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver safari=new ChromeDriver();
        SafariDriver safariDriver=new SafariDriver();
        safari.manage().window().maximize();
        Thread.sleep(2000);
        safari.navigate().to("https://google.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://facebook.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://amazon.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().back();
        safari.close();
    }
}
