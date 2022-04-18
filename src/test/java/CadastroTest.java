import okhttp3.internal.Util;
import org.h2.util.Utils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroTest {

    @Test
    public void deveriaEfetuarCadastroComDadosValidos() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://front-end-phi-lyart.vercel.app/signup");
        browser.findElement(By.id("email")).sendKeys("matheusaraujo@develcode.com.br");
        browser.findElement(By.id("password")).sendKeys("123456");
        browser.findElement(By.id("cnpj")).sendKeys("45149848940");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(2000);

        browser.findElement(By.id("name")).sendKeys("BarDoJose");
        browser.findElement(By.id("phone")).sendKeys("83996831718");
        browser.findElement(By.id("foods")).sendKeys("Nordestina");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        Thread.sleep(2000);

        browser.findElement(By.id("street")).sendKeys("Bela Vista");
        browser.findElement(By.id("city")).sendKeys("Penedo");
        browser.findElement(By.id("input_Neigh")).sendKeys("Rio De Janeiro");
        browser.findElement(By.id("input_Number")).sendKeys("133");
        browser.findElement(By.id("input_NickName")).sendKeys("Casa 2");
        browser.findElement(By.id("input_Cep")).sendKeys("58415625");
        browser.findElement(By.id("input_State")).sendKeys("PB");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[3]/form/button")).click();
        browser.quit();



    }


}
