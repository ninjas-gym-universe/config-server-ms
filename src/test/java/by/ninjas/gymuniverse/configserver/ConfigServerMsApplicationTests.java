package by.ninjas.gymuniverse.configserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"test", "native"})
@SpringBootTest
class ConfigServerMsApplicationTests {

    @Test
    void contextLoads() {
    }
}
