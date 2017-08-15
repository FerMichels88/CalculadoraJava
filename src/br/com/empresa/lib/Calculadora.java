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
	
	public double Subtrair(double valor){
		return this.resultado -= valor;
	}
	
	public double Dividir(double valor){
		return this.resultado /= valor;
	}
	
	public double Multiplica(double valor){
		return this.resultado *= valor;
	}
}