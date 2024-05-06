package hwSelenium2;

//use advance xpath to fill all text box

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/Xpath.php");

        WebElement userName= driver.findElement(By.xpath("//input[@name='exactUserEntry']"));
        userName.sendKeys("Helen");


        WebElement button= driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement q1= driver.findElement(By.xpath("//input[contains(@name,'Partial')]"));
        q1.sendKeys("Name of the first teacher");

        WebElement textContain= driver.findElement(By.xpath("//label[contains(text(),'adipisicing ')]"));
        System.out.println(textContain.getText());

        WebElement api= driver.findElement(By.xpath("//input[starts-with(@id, 'api')]"));
        api.sendKeys("ohohooh 121");


        //(//tagname[@attribute='value'])[index]
        WebElement email1= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello1@yahoo.com");

        WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hello2@yahoo.com");

        WebElement email3= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("hello3@yahoo.com");

        WebElement f1= driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        f1.sendKeys("Field1");

        WebElement f2= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        f2.sendKeys("Field2");

        WebElement field1= driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
        field1.sendKeys("Hi");

        WebElement field2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        field2.sendKeys("Hello");

        driver.quit();



        



    }
}
