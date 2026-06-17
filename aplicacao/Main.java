package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoArea x, y;
		x = new CalculoArea();
		y = new CalculoArea();
		System.out.println("Digite os valores para calulara a área do "
				+ "triangulo X e do Triangulo Y ");
		//entrada de dados para X
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		//entrada de dados para Y
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		//processamento
		double areaX = x.Area();
		double areaY = y.Area();
		//saida de dados
		System.out.printf(" %.02f cm²", areaX  );
		System.out.printf( "%.02f cm²", areaY );
		
		sc.close();
	}

}
