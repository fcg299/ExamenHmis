// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestunitariodecreacionmarcadoyborradoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testunitariodecreacionmarcadoyborrado() {
    driver.get("http://34.72.161.243:8080/");
    driver.manage().window().setSize(new Dimension(841, 553));
    driver.findElement(By.cssSelector(".form-control")).click();
    driver.findElement(By.cssSelector(".form-control")).sendKeys("Ejemplo");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector(".name")).getText(), is("Ejemplo"));
    driver.findElement(By.cssSelector(".name")).click();
    driver.findElement(By.cssSelector(".far")).click();
    assertThat(driver.findElement(By.cssSelector(".name")).getText(), is("Ejemplo"));
    driver.findElement(By.cssSelector(".fa")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.close();
  }
}
