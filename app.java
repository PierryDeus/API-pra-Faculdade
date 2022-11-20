import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class app {
    public static void main(String[] args) throws Exception {
        
        // Fazer uma conexão HTTP
        String url = "https://api.nasa.gov/planetary/apod?api_key=rlvCnEqznucK5TWh1cSQnZ0ztT9XoycKbkeiyLld&start_date=2022-06-12&end_date=2022-06-15";
    
        var http = new ClienteHTTP();
        String json = http.buscaDados(url);


        // Exibir e manipular dados
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNASA();
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var Fabrica = new FabricadeStickers();
        for (int i = 0; i < 4; i++) {
            
            Conteudo conteudo = conteudos.get(i);
    
            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            Fabrica.cria(inputStream, nomeArquivo);
            
            System.out.println(conteudo.getTitulo());
        
        
        }
    }
}
    