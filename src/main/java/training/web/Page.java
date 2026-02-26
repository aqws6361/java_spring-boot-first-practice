package training.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Page {
    @GetMapping("/multiply")
    public String multiply(Model model, @RequestParam int n1, @RequestParam int n2) {
        int ans = n1 * n2;
        model.addAttribute("result", ans);
        return "Multiply"; // 對應樣板檔案名稱
    }
}
