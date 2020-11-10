package Model;

import Actions.FormatadorDecimais;
import Calculation.CalculaValorUnitario;

public class Arroba extends Peso implements CalculaValorUnitario{
	
	public Arroba() {}
	
	public Arroba(double peso) {
		super(peso);
		this.pesoVivo = peso;
	}
	
	@Override
	public void setValorDeMercado(double valorMercado) {
		this.valorDeMercado = valorMercado;
	}
	
	@Override
	public double getValorUnitario() {
		FormatadorDecimais fd = new FormatadorDecimais();
		return fd.formataValorDecimal(this.valorUnitario);
	}
	
	@Override
	public double getPeso() {
		return this.pesoVivo;
	}

	@Override
	public double convertePeso(double peso) {
		return (peso * 0.5) / 15;
	}

	@Override
	public void calculaValorUnitario() {
		this.valorUnitario = this.valorDeMercado * this.pesoVivo;
		
	}
}
