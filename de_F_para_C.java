package F_para_C;

import java.util.Scanner;

public class de_F_para_C {

	public static void main(String[] args) {
		
	Scanner x = new Scanner (System.in);		
			
	System.out.println("Digite a temperatura em Graus Fahrenheit");
	double fh = x.nextDouble();
		
		
	double cl = ((fh - 32)*5/9);
		
		
	System.out.print("O valor de Fahrenheit para Celsius é:" + cl );
	//System.out.print("O valor de Fahrenheit para Celsius é:" + ((fh - 32)*5/9));
		
	x.close();
		
		
			
	}

}