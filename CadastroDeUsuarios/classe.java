package entities;


public class Banco {
    private int conta;
    private String nome;
    private double saldo;
    
    public Banco(int conta, String nome, double deposito){
        this.conta = conta;
        this.nome = nome;
        this.saldo = deposito;
    }
    public Banco(int conta, String nome){
        this.conta = conta;
        this.nome = nome;
        
    }

    
    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getValor() {
        return saldo;
    }

    
    public void setValor(double valor) {
        this.saldo = valor;
    }
    
    public void Deposito(double deposito){
        this.saldo += deposito;
    }
    
    public void Saque(double saque){
        this.saldo -= saque + 5;
    }
    
    public String Mostrar(){
        return conta
               + ","
               + "Usuário:" 
               + nome
               + "," 
               + "Saldo: R$ " 
               +  String.format("%.2f", saldo);
    }
    

    
    
    
    
}
