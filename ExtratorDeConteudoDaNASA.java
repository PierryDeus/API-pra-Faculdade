import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNASA implements ExtratorDeConteudo {
    public List<Conteudo> extraiConteudos (String json) {
        
        //extrair só os dados que interessam (título, imagem, classificação, etc)
        var parser = new JsonParser();
        List<Map<String, String>> ListadeAtributos = parser.parse(json);
        
        List<Conteudo> conteudos = new ArrayList<>(); 
        
        //popular a lista de conteúdos

        for (Map<String, String> atributos: ListadeAtributos) {
            String Titulo = atributos.get("title");
            String urlImagem = atributos.get("url");
            var conteudo = new Conteudo(Titulo, urlImagem);

            conteudos.add(conteudo);

        }
        return conteudos;

    }
}
