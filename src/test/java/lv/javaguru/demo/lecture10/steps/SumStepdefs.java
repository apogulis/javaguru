package lv.javaguru.demo.lecture10.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class SumStepdefs {

    private static int number1;
    private static int number2;


    @Given("^summarize (.*) and (.*)$")
    public void openBrowser(int number1, int number2) {
        SumStepdefs.number1 = number1;
        SumStepdefs.number2 = number2;
    }

    @Then("result is {int}")
    public void result_is(Integer sum) {
        int actualSum = SumStepdefs.number1 + SumStepdefs.number2;
        Assertions.assertThat(actualSum).isEqualTo(sum);
    }
}
