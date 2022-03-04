package com.global.UITests.step_definitions;

import com.global.UITests.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){Driver.get().manage().window().maximize();}

    @After
    public void after(){Driver.closeDriver();}
}
