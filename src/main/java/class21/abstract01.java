package class21;

public abstract class abstract01 {
    abstract void openbrowser();
    abstract  void loadURL();
    abstract void  perfromtesting();
    abstract void close();

}
class chromedriver extends abstract01{

    @Override
    void openbrowser() {
        System.out.println("opening the google chrome browser");
    }

    @Override
    void loadURL() {
        System.out.println("loading the URL");
    }

    @Override
    void perfromtesting() {
        System.out.println("opening the firefox browser ");
    }

    @Override
    void close() {

    }
}