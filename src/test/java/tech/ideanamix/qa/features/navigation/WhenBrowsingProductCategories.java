package tech.ideanamix.qa.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tech.ideanamix.qa.model.Category;
import tech.ideanamix.qa.steps.NavigatingUser;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser john;

    @Managed
    WebDriver browser;

    @BeforeClass
    public static void setUp() {
        final String DRIVER_PATH = System.getProperty("user.dir") + "/drivers/";
        final String OS = System.getProperty("os.name").toLowerCase();
        if (OS.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver_mac");
            //System.setProperty("webdriver.firefox.driver", DRIVER_PATH + "firefoxdriver_mac");
        }
        else if (OS.contains("windows")) {
            System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver_win.exe");
            //System.setProperty("webdriver.firefox.driver", DRIVER_PATH + "firefoxdriver_win.exe");
        }
        else if (OS.contains("linux")) {
            System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver_linux");
            //System.setProperty("webdriver.firefox.driver", DRIVER_PATH + "firefoxdriver_linux");
        }
        else {
            throw new RuntimeException("Found invalid OS Name.");
        }
    }

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        // Given
        john.isOnTheHomePage();
        // When
        john.navigatesToCategory(Category.Motors);
        // Then
        john.shouldSeePageTitleContaining("Auto Parts and Vehicles");
    }

    @Test
    public void purposefullyFailingTestToSeeFailuresOnAzure() {
        assertThat( false ).isTrue();
    }

}