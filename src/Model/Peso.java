package Model;

public abstract class Peso{
	
	protected double valorUnitario;
	protected double valorDeMercado;
	protected double pesoVivo;
	
	public Peso() {}
	
	public Peso(double peso) {
		this.pesoVivo = peso;
	}
	
	public abstract void setValorDeMercado(double valorMercado);
	
	public abstract double getPeso();
	public abstract double getValorUnitario();
	
	public abstract double convertePeso(double peso);
	
}
