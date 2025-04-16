import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesteRestaurante {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mahamfathy.github.io/Restaurant-Menu/");
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testTituloPagina() {
        assertEquals("Restaurant Menu", driver.getTitle());
    }

    private void assertEquals(String restaurantMenu, String title) {
    }

    @Test
    public void preencherFormularioNome() {
        driver.findElement(By.id("name")).sendKeys("Maria");
    }

    @Test
    public void preencherNome() {
        driver.findElement(By.id("email")).sendKeys("maria@email.com");
    }

    @Test
    public void preencherEmail() {
        driver.findElement(By.id("subject")).sendKeys("Dúvida sobre o menu");
    }

    @Test
    public void preencherMensagem() {
        driver.findElement(By.id("message")).sendKeys("Gostaria de saber se vocês têm opções vegetarianas.");
    }

    @Test
    public void clicarBotao() {
        driver.findElement(By.id("contactBtn")).click();
    }

    @Test
    public void pesquisarNoMenu() {
        WebElement search = driver.findElement(By.id("menuSearch"));
        search.sendKeys("Mojito");
    }

    @Test
    public void clicarNoMenuDessert() {
        WebElement btnDessert = driver.findElement(By.className("category-button"));
        btnDessert.click();
    }
}