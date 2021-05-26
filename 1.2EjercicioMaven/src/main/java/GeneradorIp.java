import java.util.Random;

public class GeneradorIp {
	
	public int generarNumero(int min, int max) {
		Random rnd = new Random(); 
		
		int resultado = rnd.nextInt(max-min) + min; 		
		return resultado;
	}
		
		public String generarIp() {
			String resultado = ""; 
			for (int i = 0; i < 4; i++) {
				if (i == 3) {
					resultado = resultado + generarNumero(0, 254);
				}else {
					resultado = resultado + generarNumero(0, 254) + "."; 
				}
			
			}
		return resultado; 
	}
		 
}
