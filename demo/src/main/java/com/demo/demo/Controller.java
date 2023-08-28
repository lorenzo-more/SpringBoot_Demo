import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller{
    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemBemVindo() {
        return "Bem vindo à Biblioteca Central!";
    }
}
