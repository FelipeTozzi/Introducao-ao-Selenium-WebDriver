package com.unifil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class teste {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {

            driver.get("https://portal.unifil.br/");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement matriculaInput = driver.findElement(By.id("CPF"));
            matriculaInput.sendKeys("6371829");

            WebElement acessarButton = driver.findElement(By.id("Acessar"));
            acessarButton.click();

            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha o navegador
            driver.quit();
        }
    }
}
