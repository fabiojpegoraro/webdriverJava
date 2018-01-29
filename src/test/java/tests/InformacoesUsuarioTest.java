package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        //Abrindo navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fabio\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //navegando para a página do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");
    }

    @Test
    public void testAdcionarUmaInformacaoAdicionalDoUsuario(){
        //Clicar no link que possui o text "Sign in" (Login da página)
        navegador.findElement(By.linkText("Sign in")).click();

        //Clicar no campo com name "login" que está dentro do formulário de id  "signinbox"
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulário de id  "signinbox" o texto "julio0001
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
        try{Thread.sleep(2000);} catch (InterruptedException ex){}

        //Clicar no campo com name "password" que está dentro do formulário de id  "signinbox"

        //Digitar no campo com name "login" que está dentro do formulário de id  "signinbox" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
        try{Thread.sleep(2000);} catch (InterruptedException ex){}

        //Clicar no link que possui o text "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Clicar no link que possui a class "me"
        navegador.findElement(By.className("me")).click();
        try{Thread.sleep(2000);} catch (InterruptedException ex){}

        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
        try{Thread.sleep(2000);} catch (InterruptedException ex){}

        navegador.findElement(By.xpath("//*[@id=\"moredata\"]/div[2]/button")).click();
        try{Thread.sleep(2000);} catch (InterruptedException ex){}

        navegador.findElement()

        //Validar que dentro do elemento com class "me" está o texto "Hi, Julio"
        //WebElement me = navegador.findElement(By.className("me"));
        //String textoNoElementoMe = navegador.findElement(By.className("me")).getText();
        //assertEquals("Hi, Julio", textoNoElementoMe);
        //try{Thread.sleep(2000);} catch (InterruptedException ex){}



        //Fazer Logout
        //navegador.findElement(By.linkText("Logout")).click();
        //try{Thread.sleep(2000);} catch (InterruptedException ex){}

        //Esperar 10 segundos
        //try{Thread.sleep(10000);} catch (InterruptedException ex){}
    }
    @After
    public void tearDown(){
        //Fechar o navegador
        navegador.quit();
    }
}
