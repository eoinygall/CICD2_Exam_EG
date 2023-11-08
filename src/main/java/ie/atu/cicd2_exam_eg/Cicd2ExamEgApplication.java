package ie.atu.cicd2_exam_eg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Cicd2ExamEgApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cicd2ExamEgApplication.class, args);
    }

}
