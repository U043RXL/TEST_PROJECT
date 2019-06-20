
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloGradleController {

	 @GetMapping
	    public String helloGradle() {
	        return "Hello Gradle!";
	    }
}
