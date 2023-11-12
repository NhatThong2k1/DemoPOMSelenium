//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Main {
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/v1/");
//
//        WebElement usernameTxt = driver.findElement(By.cssSelector("[data-test=\"username\"]"));
//        WebElement passwordTxt = driver.findElement(By.cssSelector("[data-test='password']"));
//        WebElement loginBtn = driver.findElement(By.cssSelector("#login-button"));
//
//        usernameTxt.sendKeys("standard_user");
//        passwordTxt.sendKeys("secret_sauce");
//        loginBtn.click();
//
//        WebElement firstAddToCartButton = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']/../../..//button"));
//        WebElement cartLnk = driver.findElement(By.cssSelector("#shopping_cart_container"));
//
//        firstAddToCartButton.click();
//        cartLnk.click();
//        WebElement checkOutBtn = driver.findElement(By.cssSelector(".checkout_button"));
//        checkOutBtn.click();
//
//        WebElement firstNameTxt = driver.findElement(By.cssSelector("[data-test='firstName']"));
//        WebElement lastNameTxt = driver.findElement(By.cssSelector("[data-test='lastName']"));
//        WebElement postalCodeTxt = driver.findElement(By.cssSelector("[data-test='postalCode']"));
//
//        firstNameTxt.sendKeys("Quang");
//        lastNameTxt.sendKeys("Test");
//        postalCodeTxt.sendKeys("70000");
//
//        driver.findElement(By.cssSelector("[type=submit]")).click();
//        driver.findElement(By.cssSelector(".cart_footer .cart_button")).click();
//
//
//        driver.quit();
//    }
//}