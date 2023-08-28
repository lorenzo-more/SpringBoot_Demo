import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller{
    private List<Livro> livros;

    publicController() {
        livros = new LinkedList<>();
        livros.add(new Livro(100, "Aprendendo Spring-Boot", "Spring", 2023));
        livros.add(new Livro(100, "Aprendendo Java", "Java", 2022));
        livros.add(new Livro(100, "Aprendendo HTML", "HTML5", 2020));
        livros.add(new Livro(100, "Aprendendo JavaScript", "JS", 2023));
    }
    
    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemBemVindo() {
        return "Bem vindo à Biblioteca Central!";
    }

    @GetMapping("livros")
    @CrossOrigin(origins = "*")
    public List<Livro> getListaLivros(){
        return livros;
    }
}
