package by.ninjas.gymuniverse.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Entry point to the application.
 *
 * @author Artyom Drobysh (artyom.drobysh96@gmail.com)
 * @version 0.1.0
 * @since 0.1.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMsApplication.class, args);
    }
}
