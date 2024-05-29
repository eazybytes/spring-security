package com.eazybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@EnableJpaRepositories("com.eazybytes.repository")
@EntityScan("com.eazybytes.model")*/
public class EazyBankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazyBankBackendApplication.class, args);
    }

}
