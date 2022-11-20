import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
//import java.io.FileInputStream;
import java.io.InputStream;
//import java.net.URL;
import java.awt.Color;
import java.awt.Font;
import javax.imageio.ImageIO;

public class FabricadeStickers {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception { 

    // Leitura da imagem
    // o InputStream é o comando que puxa a imagem de onde quer que seja
    // A própria IDE completou a parte do "pathname" 
        
        BufferedImage ImagemOriginal = ImageIO.read(inputStream);
    // Cria nova imagem com transparência em memória

        int largura = ImagemOriginal.getWidth();
        int altura = ImagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    // Copiar a imagem original para a nova imagem em memória

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(ImagemOriginal, 0, 0, null);


        // Configurar a fonte
        var Fonte = new Font(Font.SANS_SERIF, Font.BOLD, 75);
        graphics.setColor(Color.RED);
        graphics.setFont(Fonte);

        // Escrever uma frase na nova imagem

        graphics.drawString("TRAMPO DA UNIVILLE", 100, novaAltura - 100);

        // Escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));

    }

     //public static void main(String[] args) throws Exception {
        //var Fabrica = new FabricadeStickers();
        //Fabrica.cria();
        

} 

