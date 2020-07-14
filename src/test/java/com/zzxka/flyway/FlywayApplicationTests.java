package com.zzxka.flyway;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlywayApplicationTests {

    @Test
    void contextLoads() {
        Flyway flyway=new Flyway();
        flyway.setDataSource("jdbc:mysql://39.105.34.103:3306/flyway?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8","flyway","flyway1314");
        flyway.migrate();
    }

}
