package serenityswag.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
public class WhenLoggingOn {

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;
    @Test
    public void usersCanLogOnViaTheHomePage(){
        // To generate clubbed report
        // mvn serenity:aggregate

        login.asAStandardUser();

        assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");
    }
}
