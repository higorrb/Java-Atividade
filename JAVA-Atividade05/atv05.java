01)

package aula04;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite um nome: ");
		}
		for(i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, nomes[i]);
		}
	}
}





02)

import java.util.Scanner;



public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
            	int[] vetornumeros = new int[10];
           	 
            	for(int i = 0; i < 10; i++){
               	 
                	System.out.print("Digite um numero: ");
                	vetornumeros[i] = sc.nextInt();
               	 
            	}
           	 
            	System.out.println("Numeros digitados: ");
           	 
            	for(int i = 0; i < 10; i++){
               	 
                	System.out.println(vetornumeros[i]);
               	 
            	}
           	 
             	sc.close();
	}
}




03)


import java.util.Scanner;



public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
            	int[] vetornumeros = new int[10];
            	int menor; int maior;
           	 
            	System.out.print("Digite um numero: ");
            	vetornumeros[0] = sc.nextInt();
            	menor = vetornumeros[0];
            	maior = vetornumeros[0];
           	 
            	for(int i = 1; i < 10; i++){
               	 
                	System.out.print("Digite um numero: ");
                	vetornumeros[i] = sc.nextInt();
               	 
                	if (vetornumeros[i] > maior){
                    	maior = vetornumeros[i];
                	}
                	else if (vetornumeros[i] < menor){
                    	menor = vetornumeros[i];
                	}
               	 
            	}
           	 
            	System.out.println("Menor:  " + menor);
            	System.out.println("Maior:  " + maior);
           	 
           	 
             	sc.close();
	}
}

