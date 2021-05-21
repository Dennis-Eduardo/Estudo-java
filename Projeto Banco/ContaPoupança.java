
package entidades;


public class ContaPoupança extends ContaComum {
    
    private Double taxaJuros;

    public ContaPoupança(Double taxaJuros, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void atualizaSaldo(){
        saldo += saldo * taxaJuros;
    }
    
    @Override
    public void Saque(double saque){
        saldo -= saque;
    }
    
}
