package Review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Animal {
    void speak(){
        System.out.println("animal can speak");
    }
    void eat(){
        System.out.println("animal can eat");
    }
}
class dog extends Animal{
    @Override
    void speak() {
        super.speak();
    }

    @Override
    void eat() {
        super.eat();
    }
}
class cat extends Animal{
    @Override
    void speak() {
        super.speak();
    }

    @Override
    void eat() {
        super.eat();
    }
}
class tester{
    public static void main(String[] args) {
       /* Animal[]arr={new Animal(),new cat(),new dog()};
        for(Animal a:arr){
            a.eat();
            a.speak();*/

            /*ChromeDriver c=new ChromeDriver();
            c.manage().window().maximize();
            c.get("https//:www.amazone.com");
            c.getTitle();

            FirefoxDriver f=new FirefoxDriver();
            c.manage().window().maximize();
            c.get("https//:www.amazone.com");
            c.getTitle();
            EdgeDriver e=new EdgeDriver();
            c.manage().window().maximize();
            c.get("https//:www.amazone.com");
            c.getTitle();*/

            /*WebDriver []webdriver={new ChromeDriver(),new SafariDriver()};
            WebDriver driver=new ChromeDriver();
            for (int i = 0; i < webdriver.length; i++) {
                WebDriver w=webdriver[i];
                w.manage().window().maximize();
                w.get("https://www.google.com");
                System.out.println(w.getTitle());
                w.quit();*/

        WebDriver[] webdrivers = {new ChromeDriver(), new SafariDriver()};

        for (WebDriver driver : webdrivers) {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle());
            driver.quit();
        }
    }
}



