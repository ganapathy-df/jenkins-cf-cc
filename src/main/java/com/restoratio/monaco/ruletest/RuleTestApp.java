package com.restoratio.monaco.ruletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan
public class RuleTestApp {

    public static void main(String[] args) {
        SpringApplication.run(RuleTestApp.class, args);
		int k = 0;
		
		if (k == 0) {
		}
		int j = 10;
    		if (j == 0) {
		}
	    
    		if (j == 10) {
		}
}

}
