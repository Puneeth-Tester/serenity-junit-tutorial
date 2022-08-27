package serenityswag.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;


@RunWith(SerenityRunner.class)
public class WhenLoggingOn {

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;
    @Test
    public void usersCanLogOnViaTheHomePage(){
        // To generate clubbed report
        // mvn serenity:aggregate

        login.as(STANDARD_USER);

        assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");
    }
}
