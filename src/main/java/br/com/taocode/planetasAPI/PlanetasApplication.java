package br.com.taocode.planetasAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanetasApplication {
    public static void main(String[] args) {
       SpringApplication.run(PlanetasApplication.class, args);

        System.out.println("Olá mundo!!!");
    }
}