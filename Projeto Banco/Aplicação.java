package aplicacao;

import entidades.ContaComum;
import entidades.ContaEmpresa;
import entidades.ContaPoupança;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ex1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<ContaComum> lista = new ArrayList<>();

        ContaComum c2 = new ContaEmpresa(102, "Tobe", 1000.0, 300.00);
        ContaComum c3 = new ContaPoupança(0.01, 103, "Bob", 700.00);
        
        lista.add(c2);
        lista.add(c3);
        
        double soma = 0.0;
        for(ContaComum c: lista){
            soma+= c.getSaldo();
        }
        
        System.out.printf("Soma total: %.2f\n",soma);
        
        for(ContaComum c: lista){
            c.Deposito(10.00);
        }
        
        for(ContaComum c: lista){
            System.out.printf("Saldo atualizado: %d: %.2f\n",c.getNumero(),c.getSaldo());
        }

    }

}
