package aplicacao;

import entidades.Imposto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class ex5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Imposto> lista = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Dados do #%d:\n", i);
            System.out.print("Pessoa Fisica ou Pessoa Juridica(f/j): ");
            char ch = input.next().charAt(0);
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Rendimento anual: ");
            double rend = input.nextDouble();
            if (ch == 'f') {
                System.out.print("Gastos com Saúde: ");
                double gSaude = input.nextDouble();
                lista.add(new PessoaFisica(gSaude, nome, rend));
            } else {
                System.out.print("Funcionarios: ");
                int func = input.nextInt();
                lista.add(new PessoaJuridica(func, nome, rend));
            }

        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        double soma = 0.0;
        for (Imposto imp : lista) {
            System.out.println(imp.getNome() + ": " + String.format("%.2f $", imp.taxa()));
            soma += imp.taxa();
        }
        System.out.println();
        System.out.println("TOTAL DOS IMPOSTOS: $ " + String.format("%.2f", soma));

    }

}
