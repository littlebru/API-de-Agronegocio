package Actions;

import java.text.DecimalFormat;

public class FormatadorDecimais {

	public double formataValorDecimal(double v) {
		
		DecimalFormat f = new DecimalFormat("#.##");
		
		// Para formatar o valor para apenas duas casas decimais
		
		String formato = f.format(v); // o format retorna uma String
		formato = formato.replace(",", ".");

		double newVal = Double.parseDouble(formato); //Transformando o valor String em double
		
		return newVal;
	}

}
