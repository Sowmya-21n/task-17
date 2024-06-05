package task17;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

    public class MainChrome {

        ChromeDriver chromeDriver;

        @Before
        public void setUp() {
            // load chrome driver
            chromeDriver = new ChromeDriver();
            chromeDriver.manage().window().maximize();
        }

        @After
        public void tearDown(){
            // close the chrome
            chromeDriver.quit();
        }



    }
