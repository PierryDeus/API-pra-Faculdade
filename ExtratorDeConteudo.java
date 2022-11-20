import java.util.List;

public interface ExtratorDeConteudo {
    
    List<Conteudo> extraiConteudos (String json);
}

// a Interface protege os dois extratores ao forçar que o app rode utilizando ela