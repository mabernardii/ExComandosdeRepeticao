/******************************************************************************
7. Escreva um programa que calcule e exiba o valor da potência de um número 
informado pelo usuário elevado a um expoente também informado pelo usuário, 
utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
*******************************************************************************/
import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 

     double resultado = 1;
     double base, expoente;
     
     while (true){
      System.out.println("\nDigite um número para base:");
      base= ler.nextDouble ();
      System.out.println("Digite o valor do expoente:");
      expoente= ler.nextDouble();
      resultado= Math.pow(base,expoente);
      
      System.out.print ("Base:"+base);
      System.out.print ("\nExpoente:"+expoente);
      System.out.print ("\nResultado:"+resultado);
     }
     }
}
