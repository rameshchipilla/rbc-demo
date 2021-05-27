package git.rbc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MainController {

	@GetMapping
	public String welcome() {
		return "Welcome!";
	}
}
