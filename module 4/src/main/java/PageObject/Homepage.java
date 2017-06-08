package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Maryia_Shynkarenka on 6/7/2017.
 */
public class Homepage {

    WebDriver driver;
    WebDriverWait wait;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickOrigin(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='origin']/div")));
        driver.findElement(By.xpath("//*[@id='origin']/div")).click();
    }

    public void clearOrigin(){
        driver.findElement(By.xpath("//*[@id='origin']/div")).clear();
    }

    public void sendKeysOrigin(){
        driver.findElement(By.xpath("//*[@id='origin']/div")).sendKeys("dublin");
    }

    public void clickOriginSuggestion(){
        driver.findElement(By.xpath("//li[contains(@id,'typeahead')]")).click();
    }

    public void clickDestination(){
        driver.findElement(By.xpath("//*[@id='dest']")).click();
    }

    public void sendKeysDestination(){
        driver.findElement(By.xpath("//*[@id='origin']/div")).sendKeys("paris");
    }

    public void clickDestinationSuggestion(){
        driver.findElement(By.xpath("//li[contains(@id,'typeahead')]")).click();
    }


}
