
/******************************************************************************
2.Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares
de 51 a 100 utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
	
     int numero = 1;
       
     for (int i = 1; i <= 100; i++){
        if(i%2 == 0 && i <= 50)
        System.out.println("Os números pares entre 1 a 50 são: " + i);
        if(i%2 == 1 && i >= 51)
        System.out.println("Os Números ímpares de 51 a 100 são: " + i);
        }
	}
}
