public class Conteudo {
   
    private String titulo;
    private String urlImagem;
    
    
    //Generate Constructors 
    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }
    //o Generate Getters serve para puxar esses códigos abaixo para fora
    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }

    
}
