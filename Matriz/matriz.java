package udemy;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("[%d][%d]:", i, j);
                matriz[i][j] = input.nextInt();

            }
        }
        System.out.println("--------------------");
        System.out.println("Diagonal principal");
        for (int i = 0; i < n; i++) {
            
            System.out.print(matriz[i][i] + " ");

        }
        System.out.println();
        System.out.println("------------------------");

        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j]<0){
                    cont++;
                }

            }
        }
        System.out.printf("Números negativos na matriz: %d\n",cont);

    }

}
