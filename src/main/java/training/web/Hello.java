package training.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Hello {
    public static void main(String[] args) {
        // 啟動網站應用 http://127.0.0.1:8080
        SpringApplication.run(Hello.class, args);
    }
    // 提供首頁 / 的內容
    // @GetMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }
}
