import org.openqa.selenium.remote.DesiredCapabilities;

class Selenium {
    void run(){
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);


    }
}
