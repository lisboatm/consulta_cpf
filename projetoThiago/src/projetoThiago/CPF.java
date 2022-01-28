package projetoThiago;

import java.util.Scanner;

import projetoThiago.ValidaCPF;

public class CPF {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String CPF;

    System.out.printf("Informe um CPF: ");
    CPF = ler.next();

    System.out.printf("\nCPF digitado ");
        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
    if (ValidaCPF.isCPF(CPF) == true)
       System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
    else System.out.printf("inválido, favor digitar um CPF válido.\n");
    }
}
