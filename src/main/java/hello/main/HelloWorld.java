package hello.main;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorld {
	
	@RequestMapping("/")
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}

}
