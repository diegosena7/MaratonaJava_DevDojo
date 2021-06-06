package br.com.abc.introducao.operadores;

/**
 * Created by Diego Sena 06/2021.
 */
public class Operadores {
    public static void main(String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;
        int resto = 20 % 2;

        System.out.println("Resto da divisão "+ resto);
        System.out.print(numeroDouble);
    }
}
