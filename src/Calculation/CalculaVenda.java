package Calculation;

import java.util.List;

import Actions.FormatadorDecimais;
import Model.Animal;

public abstract class CalculaVenda {
	
	private double valorDeVenda;
	private FormatadorDecimais fd = new FormatadorDecimais();
	
	public double getValorDeVenda() {
		return fd.formataValorDecimal(this.valorDeVenda);
	}
	
	public void calculaValorVendaEmQuilo(List<Animal> animaisVendidos) {
		
		for(Animal animal: animaisVendidos) {
			this.valorDeVenda += animal.pesoKg.getValorUnitario() * animal.pesoKg.getPeso();
		}
	}
	
	public void calculaValorVendaEmArroba(List<Animal> animaisVendidos) {
		for(Animal animal: animaisVendidos) {
			this.valorDeVenda += animal.pesoArroba.getValorUnitario() * animal.pesoArroba.getPeso();
		}
	}
	
	
	
}
