
/******************************************************************************
1. Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares
de 51 a 100 utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
	
     int numero = 1;
       
    while (numero <= 100  ){
        if(numero%2 == 0 && numero <= 50)
        System.out.println("Os números pares entre 1 a 50 são: " + numero);
        if(numero%2 == 1 && numero >= 51)
        System.out.println("Os Números ímpares de 51 a 100 são: " + numero);
        numero++;
        }
	}
}
