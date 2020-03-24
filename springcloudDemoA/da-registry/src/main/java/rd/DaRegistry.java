package rd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DaRegistry {
    public static void main(String[] args) {
        SpringApplication.run(DaRegistry.class,args);
    }
}
