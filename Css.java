package hwSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement inputProfile= driver.findElement(By.cssSelector("input[id='profileID']"));
        inputProfile.sendKeys("12344321");

        WebElement profile= driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("New company");

        WebElement feedJ= driver.findElement(By.cssSelector("input[id='feedback']"));
        feedJ.sendKeys("New company is great");

        WebElement feedR=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedR.sendKeys("Highly recommended. R");

        WebElement eMail=driver.findElement(By.cssSelector("input[name='email']"));
        eMail.sendKeys("Whoareyou123@gmail.com");

        WebElement topic=driver.findElement(By.cssSelector("input[name*='Input']"));
        topic.sendKeys("selenium");

        WebElement intro=driver.findElement(By.cssSelector("input[data-starts='introCSSAdv']"));
        intro.sendKeys("Advanced");

        WebElement concl=driver.findElement(By.cssSelector("input[name*='conclusion']"));
        concl.sendKeys("Great job!");



    }
}
