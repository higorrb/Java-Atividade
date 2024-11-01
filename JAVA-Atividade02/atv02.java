Ex01)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
   	 
    	Scanner sc = new Scanner(System.in);
   	 
    	System.out.println("Digite um numero: ");
    	int n = sc.nextInt();
   	 
    	switch(n){
    	case 1:
        	System.out.print("UM");
        	break;
    	case 2:
        	System.out.print("DOIS");
        	break;
    	case 3:
        	System.out.print("TRES");
        	break;
    	case 4:
        	System.out.print("QUATRO");
        	break;
    	case 5:
        	System.out.print("CINCO");
        	break;
    	case 6:
        	System.out.print("SEIS");
        	break;
    	case 7:
        	System.out.print("SETE");
        	break;
    	case 8:
        	System.out.print("OITO");
        	break;
    	case 9:
        	System.out.print("NOVE");
        	break;
    	case 10:
        	System.out.print("DEZ");
        	break;
    	}
   	 
 	 
    	sc.close();
	}
}
Ex02)

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
   	 
    	Scanner sc = new Scanner(System.in);
   	 
    	System.out.println("Digite um numero: ");
    	int n = sc.nextInt();
   	 
    	switch(n){
    	case 1:
        	System.out.print("UM");
        	break;
    	case 2:
        	System.out.print("DOIS");
        	break;
    	case 3:
        	System.out.print("TRES");
        	break;
    	case 4:
        	System.out.print("QUATRO");
        	break;
    	case 5:
        	System.out.print("CINCO");
        	break;
    	case 6:
        	System.out.println("SEIS");
       	 
    	case 7:
        	System.out.println("SETE");
       	 
    	case 8:
        	System.out.println("OITO");
       	 
    	case 9:
        	System.out.println("NOVE");
       	 
    	case 10:
        	System.out.println("DEZ");
       	 
    	}
   	 
 	 
    	sc.close();
	}
}


Ex03)

import java.util.Scanner;


public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
           	 
             	System.out.println("Digite seu salario: ");
             	double salario = sc.nextDouble();
             	System.out.println("Digite sua nota: ");
             	int nota = sc.nextInt();
           	 
            	switch(nota){
             	case 1: {
                 	System.out.println(salario);
                 	break;
             	}
             	case 2: {
                 	System.out.println("5% aumento:  " + salario*1.05);
                 	break;
             	}
             	case 3:{
                 	System.out.println("10% aumento:" + salario*1.1);
                 	break;
             	}
             	case 4: {
                 	System.out.println("15% aumento: " + salario*1.15);
                 	break;
             	}
             	case 5:{
                 	System.out.println("20% aumento:  " + salario*1.2);
                 	break;
             	}
            	}
             	sc.close();
	}
}

