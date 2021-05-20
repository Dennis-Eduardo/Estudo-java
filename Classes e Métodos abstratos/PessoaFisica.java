
package entidades;


public class PessoaFisica extends Imposto {
    
    private Double gastosSaude;

    public PessoaFisica(Double gastosSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double taxa() {
       if(getRendaAnual()<20000.00){
           return (getRendaAnual() * 0.15) - (getGastosSaude()* 0.5);
       }
       else{
           return (getRendaAnual() * 0.25) - (getGastosSaude()* 0.5);
    }
    
    
    
    }


}
