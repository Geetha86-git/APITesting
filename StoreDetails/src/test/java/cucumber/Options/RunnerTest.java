package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/java/features",glue= {"StepDefinitions"})
public class RunnerTest{

	
}
