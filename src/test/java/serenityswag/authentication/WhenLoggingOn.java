package serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {

    /*@Managed
    WebDriver driver;*/

    @Test
    public void usersCanLogOnViaTheHomePage(){
        //driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com/");

        // Login as a standard user
        /*driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();*/

        /*find("[data-test='username']").sendKeys("standard_user");
        find("[data-test='password']").sendKeys("secret_sauce");
        find("[data-test='login-button']").click();*/

        $("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();

        // Should see product catalog
        /*assertThat(driver.findElement(By.cssSelector(".title")).getText())
                .isEqualToIgnoringCase("Products");*/

        //assertThat(find(".title").getText()).isEqualToIgnoringCase("Products");

        assertThat($(".title").getText()).isEqualToIgnoringCase("Products");
    }
}
