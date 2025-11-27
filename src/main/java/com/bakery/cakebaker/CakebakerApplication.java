package com.bakery.cakebaker;

import com.bakery.cakebaker.bakery.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakebakerApplication.class, args);
        // Choose the required frosting and syrup
        Frosting frosting = new ChocolateFrosting();
        syrup syrup = new StrawberrySyrup();

        // Inject dependencies into CakeBaker
        CakeBaker baker = new CakeBaker(frosting, syrup);

        // Call bakeCake()
        baker.bakeCake();
	}

}
