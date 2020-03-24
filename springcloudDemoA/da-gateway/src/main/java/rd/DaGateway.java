package rd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DaGateway {
    public static void main(String[] args) {
        SpringApplication.run(DaGateway.class,args);
    }
}
