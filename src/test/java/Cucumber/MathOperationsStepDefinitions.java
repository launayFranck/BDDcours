package Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class MathOperationsStepDefinitions {
	private MathOperations mathOperations;
    private int result;
	@Given("a calculator")
	public void a_calculator() {
	    mathOperations = new MathOperations();

	}
	@When("I add trois and cinq")
	public void i_add_trois_and_cinq() {
		
		 result=mathOperations.addition(3, 5);
	 
	}
	@Then("the result should be huit")
	public void the_result_should_be_huit() {
		 assertEquals(8,result);
	  
	}

}
