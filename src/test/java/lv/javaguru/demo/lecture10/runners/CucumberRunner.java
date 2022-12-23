package lv.javaguru.demo.lecture10.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features={"src/test/resources/lecture10/features"},
        glue = {"lv.javaguru.demo.lecture10.steps"})
public class CucumberRunner {
}
