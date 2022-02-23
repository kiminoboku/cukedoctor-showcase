package e2e;

import com.kimonsoft.cukedoctor.showcase.CalculatorService;
import com.kimonsoft.cukedoctor.showcase.CukedoctorShowcaseApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@CucumberContextConfiguration
@SpringBootTest(classes = CukedoctorShowcaseApplication.class)
public class StepDefinitions {

    @Autowired
    CalculatorService calculatorService;

    private BigInteger n1;
    private BigInteger n2;
    private BigInteger result;

    @Given("n1 is {}")
    public void n1Is(BigInteger number) {
        n1 = number;
    }

    @Given("n2 is {}")
    public void n2Is(BigInteger number) {
        n2 = number;
    }

    @When("user performs add operation")
    public void userPerformsAddOperation() {
        result = calculatorService.add(n1, n2);
    }

    @Then("the outcome result should be {}")
    public void theOutcomeResultShouldBe(BigInteger number) {
        Assertions.assertThat(result).isEqualByComparingTo(number);
    }
}
