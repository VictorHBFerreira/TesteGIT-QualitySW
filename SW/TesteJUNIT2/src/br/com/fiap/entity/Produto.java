package br.com.fiap.entity;


public class Produto {
	
	private double peso;
	private double altura;
	
	
	
	public Produto() {
		super();
	}
	public Produto(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
