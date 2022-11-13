
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bring_It_On {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\papka\\programms\\Git\\Epam\\lab9\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://pastebin.com");
        WebElement CodeInput = driver.findElement(By.id("postform-text"));
        CodeInput.sendKeys(
                "git config --global user.name  \"New Sheriff in Town\" \ngit reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\ngit push origin master --force");

        driver.findElement(By.id("select2-postform-format-container")).click();
        driver.findElement(By.xpath("//li[text()='Bash']")).click();

        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();

        WebElement NameInput = driver.findElement(By.id("postform-name"));
        NameInput.sendKeys("helloweb");
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
        Thread.sleep(2000);
    }
}
