/******************************************************************************
10.  Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos 
estão entre 0 e 100.
*******************************************************************************/
import java.util.Scanner;
public class Ex10
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
     int numerosEntre0e100=0;
     int numeros = 1;
     int numero;
     
     while (numeros<=10){
      System.out.println("Digite o " +numeros+ "º número:");
      numero = ler.nextInt ();
      numeros++;
      if (numero >=0 && numero <=100) {
      numerosEntre0e100++;
      }
     }
     System.out.println ("Há " +numerosEntre0e100+ " números entre 0 e 100.");
     }
}
