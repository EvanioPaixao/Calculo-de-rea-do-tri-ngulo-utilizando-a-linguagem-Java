package aplicacao;

public class CalculoArea {
	public double a;
	public double b;
	public double c;

	public double Area(){
		 return Math.sqrt(((a + b + c)/2) *
				 (((a + b + c)/2) - a)*
				 (((a + b + c)/2)-b) *
				 (((a + b + c)/2)- c));
	 }
}
