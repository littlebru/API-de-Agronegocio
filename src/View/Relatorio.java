package View;

import java.util.List;

import Actions.FormatadorDecimais;
import Model.*;
import Register.*;

public class Relatorio {
	CartaoVacina cartV = new CartaoVacina();
	FormatadorDecimais f = new FormatadorDecimais();
	
	public void printRelatorio(Registro reg) {
		System.out.println("______RELATÓRIO DO REBANHO______");

		// Quantidade total de animais cadastrados.
		int qntCad = reg.getListaDeAnimais().size();
		System.out.printf("TOTAL DE ANIMAIS: %d \n", qntCad);

		double TotalKg=0, TotalArroba=0;
		int qntMach = 0, qntFem=0;

		// Pegando as variáveis
		for (Animal animal : reg.getListaDeAnimais()) {
			
			animal.pesoKg.setValorDeMercado(6.67);
			animal.pesoArroba.setValorDeMercado(287.85);
			
			// Peso
			TotalKg += animal.pesoKg.getValorUnitario();
			TotalArroba += animal.pesoArroba.getValorUnitario();

			// Gênero
			if (animal.getGenero() == "M") {
				qntMach++;
			} else {
				qntFem++;
			}

		}

		// Quantidade de animal para cada gênero
		System.out.printf("TOTAL DE MACHOS: %d \n", qntMach);

		System.out.printf("TOTAL DE FÊMEAS: %d \n", qntFem);

		// Porcentagem de animais vacinados
		double percVacin = porcentVacinados(qntCad, reg);
		System.out.printf("PORCENTAGEM DE VACINADOS: %.1f %% \n", percVacin);
		
		// Peso total de animais cadastrados
		System.out.printf("PESO TOTAL: %.1f Kg/ %.1f @\n", TotalKg, TotalArroba);
		
		// Preço total dos animais cadastrados
		//double precoTotal = TotalArroba * CalcularValorUnitário;
		
		double totalPreco = new Arroba(TotalArroba).getValorUnitario();
		System.out.printf("PREÇO TOTAL: R$ %.2f \n", totalPreco);
	}
	
	
	
	public double porcentVacinados(int quantidadeDeAnimaisCadastrados, Registro reg) {
		int	vacinados = 0;
		for(Animal a: reg.listaDeAnimais) {
			if(a.vacinasTomadas.size() != 0) {
				vacinados += 1;
			}
		}
		return (vacinados * 100)/ quantidadeDeAnimaisCadastrados;
		// Formatando as casas decimais da porcentagem
	}


}