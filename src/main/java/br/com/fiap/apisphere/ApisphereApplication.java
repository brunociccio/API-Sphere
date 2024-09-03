package br.com.fiap.apisphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ApisphereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisphereApplication.class, args);
	}

	@RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "API Back-end Sphere";
    }

}
