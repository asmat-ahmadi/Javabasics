package class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interface9 {


    public static void main(String[] args) throws  InterruptedException {
        WebDriver w=new ChromeDriver();
        w.manage().window().maximize();
        Thread.sleep(2000);
        w.navigate().to("https://google.com");
                Thread.sleep(2000);
        System.out.println(w.getTitle());
        Thread.sleep(2000);
        w.close();
    }
    }

