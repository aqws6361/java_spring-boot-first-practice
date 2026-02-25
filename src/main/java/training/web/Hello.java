package training.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class Hello {
    public static void main(String[] args) {
        // 啟動網站應用 http://127.0.0.1:8080/
        SpringApplication.run(Hello.class, args);
    }
    // 處理來自路徑 / 的請求
    // @GetMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }
    // 處理來自路徑 /test 的請求
    @GetMapping("/test")
    public String test() {
        return "Hello Routing Test";
    }
    // 處理來自路徑 /user/任意文字 的請求
    @GetMapping("/user/{name}")
    public String user(@PathVariable String name) {
        return "Hello " + name;
    }
    // 處理來自路徑 /spuare/任意的整數 的請求
    @GetMapping("/spuare/{number}")
    public String spuare(@PathVariable int number) {
        return "Result is "+(number*number);
    }
}
