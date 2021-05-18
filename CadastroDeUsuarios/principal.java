package Exercicios;

import entities.Banco;
import java.util.Locale;
import java.util.Scanner;


public class CadastroUsuario {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Banco banco;
        
        System.out.print("Número da conta: ");
        int conta = input.nextInt();
        input.nextLine();
        System.out.print("Nome do Usuário: ");
        String nome = input.nextLine();
        System.out.print("Deseja fazer algum depósito: (s/n)");
        char op = input.next().charAt(0);
        if (op == 's'){
            System.out.print("Informe o depósito: ");
            double deposito = input.nextDouble();
            banco = new Banco(conta,nome,deposito);
        }
       
        else{
           banco = new Banco(conta,nome);
        }
        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println("Conta: " + banco.Mostrar());
        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        double deposito = input.nextDouble();
        banco.Deposito(deposito);
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println("Conta: " + banco.Mostrar());
        System.out.println();
        System.out.print("Insira o valor do saque: ");
        double saque = input.nextDouble();
        banco.Saque(saque);
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println("Conta: " + banco.Mostrar());
        
        
        
        
        
        
    }
    
}
