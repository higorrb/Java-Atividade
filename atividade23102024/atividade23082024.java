package projetonovo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Digite um numero: ");
	int n1 = input.nextInt();
	System.out.println("Digite outro numero: ");
	int n2 = input.nextInt();
	System.out.println("Digite mais um numero: ");
	int n3 = input.nextInt();
	
	
	int soma = n1 + n2;
	int sub = n1 - n2;
	int mult = n1 * n2;
	int div = n1/n2;
	
	System.out.println("-----N1 e N2-----");
	System.out.println("Soma: " + soma);
	System.out.println("Subtração: " + sub);
	System.out.println("Multiplicação: " + mult);
	System.out.println("Divisão: " + div);
	
	int media = (n1 + n2 + n3)/3;
	
	System.out.println("Media dos três números: " + media);
	
	
	String nome1 = JOptionPane.showInputDialog("Digite uma palavra: ");
	String nome2 = JOptionPane.showInputDialog("Digite outra palavra: ");
	String nome3 = JOptionPane.showInputDialog("Digite mais uma palavra: ");
	
	
	JOptionPane.showMessageDialog(null,nome1 + nome2 + nome3);
	JOptionPane.showMessageDialog(null,nome1 + nome3 + nome2);
	JOptionPane.showMessageDialog(null,nome2 + nome1 + nome3);
	JOptionPane.showMessageDialog(null,nome2 + nome3 + nome1);
	JOptionPane.showMessageDialog(null,nome3 + nome2 + nome1);
	JOptionPane.showMessageDialog(null,nome3 + nome1 + nome2);
	}
	
}