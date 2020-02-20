package com.ui.run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/LineasDeCredito/ADC3237_Disposicin-de-lineas-paralelas.feature"},
        glue = { "com.mibanco.ui.steps" },
        tags = {"not @tag", "@tag1"},
        plugin = {"json:target/cucumber-reports/Cucumber.json" },
        monochrome = true)
public class RunCukeTest {

    static BaseAppium ba = new BaseAppium();
    @BeforeClass
    public static void iniciarAppium() throws MalformedURLException, Exception {
        ba.initAppium();
        Thread.sleep(15000);
    }

    @AfterClass
    public static void CerrarAppium() {
        ba.endAppium();
    }

}
