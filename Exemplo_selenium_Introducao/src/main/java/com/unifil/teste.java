package com.unifil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class teste {
    public static void main(String[] args) {
        // Configura o caminho do GeckoDriver (Firefox)
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");

        // Inicializa o WebDriver para Firefox
        WebDriver driver = new FirefoxDriver();

        try {
            // Acessa o portal da UniFil
            driver.get("https://portal.unifil.br/");

            // Maximiza a janela do navegador
            driver.manage().window().maximize();

            // Tempo de espera para carregar os elementos
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Localiza o campo de matrícula e insere os dados
            WebElement matriculaInput = driver.findElement(By.id("CPF"));
            matriculaInput.sendKeys("6371829");

            // Localiza o botão "Acessar" e clica nele
            WebElement acessarButton = driver.findElement(By.id("Acessar"));
            acessarButton.click();

            // Aguarda um pouco para visualizar o resultado
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha o navegador
            driver.quit();
        }
    }
}
