01)


import java.util.Scanner;


public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
             	System.out.println("Digite um numero: ");
             	int num = sc.nextInt();
           	 
            	int i = 0;
           	 
            	while(i <= num){
                	System.out.print(i + " ");
                	i++;
            	}
           	 
             	sc.close();
	}
}


02)


import java.util.Scanner;


public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
            	int num;
           	 
             	do{
                	 
             	System.out.println("Digite um numero: ");
             	num = sc.nextInt();
            	 
             	}while(num != 0);
           	 
           	 
             	sc.close();
	}
}





03) 

import java.util.Scanner;


public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
            	int num;
            	int soma = 0;
           	 
             	do{
                	 
             	System.out.println("Digite um numero: ");
             	num = sc.nextInt();
             	soma = soma + num;
            	 
             	System.out.println(soma);
            	 
             	}while(soma < 1000);
           	 
           	 
             	sc.close();
	}
}




04)

import java.util.Scanner;


public class Main {
        	public static void main(String[] args) {
           	 
            	Scanner sc = new Scanner(System.in);
           	 
            	int num;
            	int soma = 0;
           	 
             	do{
                	 
             	System.out.println("Digite um numero: ");
             	num = sc.nextInt();
             	soma = soma - num;
            	 
             	System.out.println(soma);
            	 
             	}while(soma  > -1000);
           	 
           	 
             	sc.close();
	}
}



