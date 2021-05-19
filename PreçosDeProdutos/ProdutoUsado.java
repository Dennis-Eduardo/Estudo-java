
package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ProdutoUsado extends Produto{
    private Date fabricacao;
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    public ProdutoUsado(Date fabricacao, String nome, Double preco) {
        super(nome, preco);
        this.fabricacao = fabricacao;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }
    
    
    @Override
     public String precoEtiqueta(){
         return getNome() 
                 + "Usado" 
                 + "$" 
                 + String.format("%.2f", getPreco()) 
                 + "(Data de fabricação: " 
                 + sdf.format(fabricacao )
                 + ")";
                 
         
     }
    
}
