package com.global.UITests.step_definitions;

import com.global.UITests.pages.MainPage;
import com.global.UITests.utilities.ConfigurationReader;
import com.global.UITests.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class MainStepDefinitions {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("the user should see {int} songs availabe in the playlist")
    public void the_user_should_see_songs_availabe_in_the_playlist(int songNumber) {
        Assert.assertEquals(songNumber, new MainPage().getTheNumberOfSongsInPlaylist());
    }

}
