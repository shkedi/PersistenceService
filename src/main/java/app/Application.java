package app;

import data.DataConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(app.Application.class, args);
    }

    @Bean
    public DataConsumer dataConsumer() {
        return new DataConsumer();
    }
}

