
/******************************************************************************

4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse 
número utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 

     int num, resultado;
     
     System.out.println ("Entre com o número desejado, para realizar a tabuada: ");
     num= ler.nextInt ();
     
     for (int i=0; i<=10; i++){
        resultado= num*i;
        System.out.println(num  + "X" +i+ "=" + resultado );
     }
      
	}
}
