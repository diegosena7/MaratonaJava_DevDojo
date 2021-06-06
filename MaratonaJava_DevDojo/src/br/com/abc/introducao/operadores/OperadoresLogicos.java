package br.com.abc.introducao.operadores;

/**
 * Created by Diego Sena 06/2021.
 * Teste de operadores lógicos.
 */
public class OperadoresLogicos {
    public static void main(String[]  args){
        int idade = 18;
        float salario = 5000f;

        System.out.println(idade >= 18 && salario >= 2000);//true
        System.out.println(idade > 18 && salario >= 2000);//false

        System.out.println(idade > 18 || salario >= 2000);//true
        System.out.println(idade > 18 || salario > 5000);//false
    }
}
