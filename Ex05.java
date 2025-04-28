/******************************************************************************
5. Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 
utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Ex05
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 

     int num, resultado;
     int numero=1;
     int soma =0;
     
     while (numero <= 100){
        if (numero%2==0)
        soma += numero;
        numero ++;
     }
    System.out.println("A soma de todos números pares entre 1 á 100 é:" + soma);
	}
}
