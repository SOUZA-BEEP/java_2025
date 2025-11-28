package tpc;

import java.util.Scanner;

public class tpc {

    static void criamatriz() {
        Scanner input = new Scanner(System.in);
        // pedir linhas
        System.out.print("Número de linhas: ");
        int linhas = input.nextInt();        
        // pedir colunas
        System.out.print("Número de colunas: ");
        int colunas = input.nextInt();
        // criar matriz
        int[][] matriz = new int[linhas][colunas];
        // preencher matriz, ver a posição da matirz ver o valor e guarda  apsoição da coluna
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(" [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        criamatriz(); // chamar o método
    }
}
