01)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=100; i++ ) {
			System.out.println(i);
		};
		
	sc.close();
	}
}


02)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for(int i = 100; i>=1; i-- ) {
			System.out.println(i);
		};
		
		sc.close();
	}
}


03)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=100; i++ ) {
			
			if(i%2==0)
			System.out.println(i);
		};
		
		
		sc.close();
	}
}


04)


package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=100; i++ ) {
			
			if(i%2!=0)
			System.out.println(i);
		};
		
		
		sc.close();
	}
}

05)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 1; i<=10; i++ ) {
			
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			
			soma = soma + num;
			
		};
		System.out.println(soma);
		
		sc.close();
	}
}

06)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++ ) {
		for(int j = 1; j<= i; j++) {
			System.out.print("*");
		}	
		System.out.println();
			
		}
		
		
		sc.close();
	}
}


07)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++ ) {
		for(int j = n; j>= i; j--) {
			System.out.print(" ");
			
		}	
		for(int k = 1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
			
		}
		
		
		sc.close();
	}
}

08)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++ ) {
		for(int j = n; j>= i; j--) {
			System.out.print("*");
			
		}	
		System.out.println();
			
		}
		
		
		sc.close();
	}
}





09)

package aula04;
import java.util.Scanner;
public class projetosc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++ ) {
			for(int k = 1; k<=i; k++) {
				System.out.print(" ");
			}	
			for(int j = n; j>= i; j--) {
				System.out.print("*");
			
			}	
		
		System.out.println();
			
		}
		
		
		sc.close();
	}
}






DESAFIO

01)

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
   	 
    	int n, i = 1, j = 0, d = 0, contador = 0;
   	 
    	Scanner sc = new Scanner(System.in);
   	 
    	System.out.print("Digite um numero: ");
    	n = sc.nextInt();
   	 
    	if (n > 0){
        	System.out.println(i);
        	contador++;
    	}
    	while(i != n){
        	i++;
        	d = 0;
        	for (j = 1; j <= (i/2) ; j++ ){
            	if(i % j == 0){
                	d++;
            	}
            	if(d > 1){
                	break;
            	}
        	}
        	if(d == 1){
            	System.out.println(i);
            	contador++;
        	}
    	}
    	sc.close();
	}
}



02)


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
   	 
    	Scanner sc = new Scanner(System.in);
   	 
    	int i, num0 = 0, num1 = 1, soma = 0;
   	 
    	System.out.print("Digite um numero para o limite da sequecia de Fibonacci: ");
    	int n = sc.nextInt();
   	 
    	if (n >= 1){
        	System.out.print(num0 + " ");
    	}
    	if(n >= 2){
        	System.out.print(num1 + " ");
    	}
   	 
   	 
   	 
    	for( i = 3; i <= n; i++){
        	soma = num0 + num1;
        	System.out.print(soma + " ");
        	num0 = num1;
        	num1 = soma;
    	}
   	 
  	sc.close();
   	 
	}
}







03)


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
   	 
    	Scanner sc = new Scanner(System.in);
   	 
    	System.out.println("Digite a altura do losango (um número ímpar): ");
    	int n = sc.nextInt();
	 
   	 
   	 
    	for (int i = 1; i <= n / 2 + 1; i++) {
        	for (int j = i; j <= n / 2; j++) {
            	System.out.print(" ");
        	}
        	for (int k = 1; k <= 2 * i - 1; k++) {
            	System.out.print("*");
        	}
        	System.out.println();
    	}


    	for (int i = n / 2; i >= 1; i--) {
        	for (int j = n / 2; j >= i; j--) {
            	System.out.print(" ");
        	}
        	for (int k = 1; k <= 2 * i - 1; k++) {
            	System.out.print("*");
        	}
        	System.out.println();
    	}
   	 
    	sc.close();
	}
}









