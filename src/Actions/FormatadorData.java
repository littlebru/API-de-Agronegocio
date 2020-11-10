package Actions;

import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatadorData {
		
	public String formataData(String dt){
		
		String novaData = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Date data = null;
		
		try {
			data = formato.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		novaData = formato.format(data);
		
		return novaData;
	}
	
	
}
