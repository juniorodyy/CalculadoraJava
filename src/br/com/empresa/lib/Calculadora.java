 package br.com.empresa.lib;

public class Calculadora {
	public double resultado;
	
	public double getResultado (){
		return this.resultado;
	}
	
	public double Somar(double valor) {
		
		return this.resultado += valor;
	}
}
