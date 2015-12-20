package cloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigServer
public class Starter {
    public static void main(String[] args){
        new SpringApplicationBuilder(Starter.class).web(true).build().run(args);
    }
}
