package task17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDeal extends MainChrome {
    @Test
    public void test1() throws InterruptedException {

        //load url
        chromeDriver.get("https://www.snapdeal.com/");

        //move to signIn button and click it
        WebElement signIn = chromeDriver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        signIn.click();

        //click login button
        WebElement logIn = chromeDriver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
        logIn.click();
        Thread.sleep(1000);

        //Move to login frame
        WebElement loginFrame = chromeDriver.findElement(By.xpath("//iframe[@id='loginIframe']"));
        chromeDriver.switchTo().frame(loginFrame);

        // Enter the Email id
        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='userName']"));
        email.sendKeys("sowmya@gmail.com");

        // Click on the Continue button
        WebElement continueBtn = chromeDriver.findElement(By.xpath("//button[@id='checkUser']"));
        continueBtn.click();
    }
}