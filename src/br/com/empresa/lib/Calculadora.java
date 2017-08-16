package br.com.empresa.lib;

public class Calculadora {
	private double resultado;
	
	public Calculadora() {
	}
	
	public Calculadora(double valor) {
		this.resultado = valor;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public double Somar(double valor) {
		return this.resultado += valor;
	}
	
	public double Somarl(double valor) {
		this.resultado += valor;
		return this.resultado -= valor;
	}
	
	public double Subtrair(double valor) {
		return this.resultado -= valor;
		
	}	
	
	public double Subtrairl(double valor) {
		this.resultado -= valor;
		return this.resultado += valor;
	}
	
	public double Dividir(double valor) {
		return this.resultado /= valor;
		
	}
	
	public double Dividirl(double valor) {
		this.resultado /= valor;
		return this.resultado *= valor;
		
	}
	
	public double Multiplicar(double valor) {
		return this.resultado *= valor;
		
	}
	
	public double Multiplicarl(double valor) {
		this.resultado *= valor;
		return this.resultado /= valor;
		
	}

}