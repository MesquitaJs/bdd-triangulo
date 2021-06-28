package definicaoPassos;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/triangulo.feature"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class TrianguloTest {
}