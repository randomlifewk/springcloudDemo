package rd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DaItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(DaItemApplication.class,args);
    }
}
