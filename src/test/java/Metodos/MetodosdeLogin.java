package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosdeLogin {
	
	
	WebDriver driver;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void preencher(By elemnto, String texto) {
		driver.findElement(elemnto).sendKeys(texto);
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validartexto(By elemento, String textoesperado) {
		String texto = driver.findElement(elemento).getText();
		System.out.println(texto);
		assertEquals(textoesperado, texto);

	}

public void tirarPrint (String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);	

	}
	public void scroll(By elemento) {
        WebElement element = driver.findElement(elemento);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
}


