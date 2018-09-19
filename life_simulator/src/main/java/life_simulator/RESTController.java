package life_simulator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RESTController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "hello";
	}
}