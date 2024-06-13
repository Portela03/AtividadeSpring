package com.hastydev.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
		

	}
	@GetMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/page1")
    public String showPage1() {
        return "page1";
    }

    @GetMapping("/page2")
    public String showPage2() {
        return "page2";
    }


}
