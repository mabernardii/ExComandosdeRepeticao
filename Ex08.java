/******************************************************************************
8. Leia a idade de cinco pessoas e exiba a soma e a média das idades. 
*******************************************************************************/
import java.util.Scanner;
public class Ex08
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 

     int pessoas = 1;
     double soma=0;
     double media, idade;
     
     while (pessoas<=5){
      System.out.println("Digite a " +pessoas+ "º idade:");
      idade= ler.nextInt ();
      soma+=idade;
      pessoas++;
     }
      media= soma/5;
      
      System.out.print ("A soma das idades inseridas é de: "+soma);
      System.out.print ("\nA média de idades é: "+media);
     }
}
