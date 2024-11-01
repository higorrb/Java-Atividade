Ex01)

package aula04;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		int nota = sc.nextInt();
		
		if(nota>5) {
			System.out.println("Parabéns você passou");
		}
		else
			System.out.println("REPROVADO");
		
		sc.close();
	}
}



Ex02)

package aula04;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Par");
		}
		else
			System.out.println("Impar");
		
		sc.close();
	}
}




Ex03)

package atividades;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite um numero: ");
		 int n1 = sc.nextInt();
		 System.out.println("Digite outro numero: ");
		 int n2 = sc.nextInt();
		 String op = JOptionPane.showInputDialog("Digite um operador(+,-,*,/): ");
		 if(op.equals("+")) {
			 System.out.println(n1+n2);
		 }
		 if(op.equals("-")) {
			 System.out.println(n1-n2);
		 }
		 if(op.equals("*")) {
			 System.out.println(n1*n2);
		 }
		 if(op.equals("/")) {
			 System.out.println(n1/n2);
		 }
		 sc.close();
	}
}

Ex04)

package atividades;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite um numero: ");
		 int n1 = sc.nextInt();
		 int maior = n1;
		 int menor = n1;
		 System.out.println("Digite outro numero: ");
		 int n2 = sc.nextInt();
		 if(n2>maior)
			 maior = n2;
		 if(n2<menor)
			 menor = n2;
		 System.out.println("Digite outro numero: ");
		 int n3 = sc.nextInt();
		 if(n3>maior)
			 maior = n3;
		 if(n3<menor)
			 menor = n3;
		 System.out.println("Digite outro numero: ");
		 int n4 = sc.nextInt();
		 if(n4>maior)
			 maior = n4;
		 if(n4<menor)
			 menor = n4;
		 System.out.println("maior: " + maior);
		 System.out.println("menor: " + menor);
		 sc.close();
	}
}


Ex05)

package aula04;
import java.util.Scanner;
public class Principal {
			public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
				
				 int media;
				
				 System.out.println("Digite um numero: ");
				 int n1 = sc.nextInt();
				 int menor = n1;
				
				
				 System.out.println("Digite outro numero: ");
				 int n2 = sc.nextInt();
				
				 media = (n1 + n2)/2;
				
				 if(media>5)
					 System.out.println("Aprovado!");
				 else if(media<5) {
				 if(n2<menor)
					 menor = n2;
				 System.out.println("Digite outro numero: ");
				 int n3 = sc.nextInt();
				 if(n3<menor)
					 menor = n3;
				
				 if(menor==n1) {
					 media = (n2 + n3)/2;
					 if(media>5)
						 System.out.println("Aprovado!");
					 else
						 System.out.println("Reprovado");
				 }
				 if(menor==n2) {
					 media = (n1 + n3)/2;
					 if(media>5)
						 System.out.println("Aprovado!");
					 else
						 System.out.println("Reprovado");
				 }
				 if(menor==n3) {
					 media = (n2 + n1)/2;
					 if(media>5)
						 System.out.println("Aprovado!");
					 else
						 System.out.println("Reprovado");
				 }
				 }
				
				
				 sc.close();
	}
}


Ex06)


package aula04;
import java.util.Scanner;
public class Principal {
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				
				 System.out.println("Digite um salario: ");
				 double salario = sc.nextDouble();
				
				 if(salario > 4000) {
					 salario = salario * 0.71;
					 System.out.println("29% " +salario);
				 }
				 else if(salario>3000 && salario<=4000) {
					 salario = salario * 0.78;
					 System.out.println("22% " +salario);
				 }
				 else if(salario> 2000 && salario<=3000) {
					 salario = salario * 0.85;
					 System.out.println("15% " +salario);
				 }
				 else if(salario>1000 && salario<=2000) {
					 salario = salario * 0.93;
					 System.out.println("7% " +salario);
				 }
				 else if(salario<=1000) {
					 System.out.println(salario);
				 }
				
				
				 sc.close();
	}
}



Ex07)

package aula04;
import java.util.Scanner;
public class Principal {
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				
				 System.out.println("Digite seu salario: ");
				 double salario = sc.nextDouble();
				 System.out.println("Digite sua nota: ");
				 int nota = sc.nextInt();
				
				 if(nota<=10 && nota>8) {
					 salario = salario * 1.20;
					 System.out.println("20% aumento:  " +salario);
				 }
				 else if(salario<=8 && nota>6) {
					 salario = salario * 1.15;
					 System.out.println("15% aumento:  " +salario);
				 }
				 else if(nota<=6 && nota>4) {
					 salario = salario * 1.10;
					 System.out.println("10% aumento:" +salario);
				 }
				 else if(nota<=4 && nota>2) {
					 salario = salario * 1.05;
					 System.out.println("5% aumento: " +salario);
				 }
				 else if(nota<=2) {
					 System.out.println(salario);
				 }
				
				 sc.close();
	}
}

