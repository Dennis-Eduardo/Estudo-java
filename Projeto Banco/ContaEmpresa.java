
package entidades;


public class ContaEmpresa extends ContaComum{
    private Double limite;

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public void Emprestimo(double valor ){
        if(valor <= limite){
            saldo += valor - 10.0;
        }
    }
    
    @Override
    public void Saque(double saque){
        super.Saque(saque);
        saldo -= 2.0;
    }
}
