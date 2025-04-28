/******************************************************************************
6. Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 
utilizando um laço de repetição. Utilize for.
*******************************************************************************/
import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 

     int resultado;
     int numero=1;
     int soma =0;
     
     for (int i=0; i<=100; i++){
        if (i%2==0){
        soma += i;
     }
     }
    System.out.println("A soma de todos números pares entre 1 á 100 é:" + soma);
     
     }
}
