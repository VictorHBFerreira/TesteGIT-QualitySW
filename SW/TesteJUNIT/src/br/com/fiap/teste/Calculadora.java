package br.com.fiap.teste;

public class Calculadora{
	private int resultado = 0;
	
	public int somar( int n1, int n2 ){
	resultado = n1 + n2; 
	return 	resultado;
	}
	
	public int subtrair( int n1, int n2 ){
	resultado = n1 -n2; 
	return resultado; 
	}        
	
	public int multiplicar( int n1, int n2 ){
	resultado = n1 * n2; 
	return resultado;
	}
	
	public int dividir( double n1, double n2 ){
	resultado = (int) (n1 / n2); 
	return resultado;
	}
	
}
