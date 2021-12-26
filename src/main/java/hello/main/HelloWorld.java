package hello.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {
	
	
	@RequestMapping("/")
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}

}
