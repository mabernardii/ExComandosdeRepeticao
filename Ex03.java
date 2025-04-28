
/******************************************************************************

3.Crie um programa que solicite ao usuário um número e exiba a tabuada desse 
número utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
	
     int numero = 0;
     int num, resultado;
     
     System.out.println ("Entre com o número desejado, para realizar a tabuada: ");
     num= ler.nextInt ();
     
     while (numero<= 10){
        resultado= numero*num;
        System.out.println(num  + "X" +numero+ "=" + resultado );
     
        numero++;
     }
      
	}
}
