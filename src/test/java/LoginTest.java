import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    @Test
    public void deveriaEfetuarLoginComDadosValidos(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://front-end-eight-vert.vercel.app/login");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/span[1]/input")).sendKeys("eve.holt@reqres.in");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/span[2]/input")).sendKeys("cityslicka");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        //browser.findElement(By.xpath("/html/body/div[1]/div/span[2]/a/svg")).click();

    }
}
