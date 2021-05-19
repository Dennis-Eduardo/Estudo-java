package aplicacao;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o número de produtos: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto #" + i);
            System.out.print("Comum, usado ou importado (c / u / i)?");
            char ch = input.next().charAt(0);
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Preço: ");
            double preco = input.nextDouble();
            if (ch == 'i') {
                System.out.print("Taxa da Alfândega: ");
                double alfan = input.nextDouble();
                ProdutoImportado importado = new ProdutoImportado(alfan, nome, preco);
                lista.add(importado);
            }
            else if (ch == 'u') {
                System.out.print("Data de fabricação (DD / MM / AAAA): ");
                Date ProdutoUsado = sdf.parse(input.next());
                ProdutoUsado usado = new ProdutoUsado(ProdutoUsado, nome, preco);
                lista.add(usado);

            } else {
                Produto comum = new Produto(nome, preco);
                lista.add(comum);
            }

        }
        System.out.println();
        System.out.println("Etiquetas de preços: ");
        for (Produto p : lista) {

            System.out.println(p.precoEtiqueta());
        }

    }

}
