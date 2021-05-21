
package entidades;


public abstract class ContaComum {
    private Integer numero;
    private String titular;
    protected Double saldo;

    public ContaComum(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void Saque(double saque){
        saldo -= saque + 5.0;
        
    }
     public void Deposito(double deposito){
         saldo += deposito;
        
    }
    
    
}
