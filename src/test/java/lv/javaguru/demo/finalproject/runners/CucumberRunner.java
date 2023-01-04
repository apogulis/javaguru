package lv.javaguru.demo.finalproject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features={"src/test/resources/finalproject/features"},
        glue = {"lv.javaguru.demo.finalproject.steps"})
public class CucumberRunner {
}

