/******************************************************************************
9. Escreva um programa que leia 20 números do usuário e exiba quantos 
números são maiores que 10.
*******************************************************************************/
import java.util.Scanner;
public class Ex09
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
     int numerosMaioresQueDez=0;
     int numeros = 1;
     int numero;
     
     while (numeros<=20){
      System.out.println("Digite a " +numeros+ "º número:");
      numero = ler.nextInt ();
      numeros++;
   
      if (numero >=10) {
      numerosMaioresQueDez++;
      }
     }
     System.out.println ("Há " +numerosMaioresQueDez+ " números maiores que 10.");
     }
}
