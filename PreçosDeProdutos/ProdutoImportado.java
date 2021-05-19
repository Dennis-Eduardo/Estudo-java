
package entidades;


public class ProdutoImportado extends Produto {
    private double alfandega;

    public ProdutoImportado(double alfandega, String nome, Double preco) {
        super(nome, preco);
        this.alfandega = alfandega;
    }

    public double getAlfandega() {
        return alfandega;
    }

    public void setAlfandega(double alfandega) {
        this.alfandega = alfandega;
    }
    
    
    public double totalPreco(){
        return getPreco() + alfandega;
    }
    
    @Override
    public String precoEtiqueta(){
        return getNome() 
                + " $" 
                + String.format("%.2f ",totalPreco()) 
                + "(Taxa alfandegária: $" 
                + String.format("%.2f",alfandega) 
                + ")" ;
    }
    
}
