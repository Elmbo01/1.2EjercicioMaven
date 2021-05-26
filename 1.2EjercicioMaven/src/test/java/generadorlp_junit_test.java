import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class generadorlp_junit_test {
/**
 * 
 * @throws Exception
 */
	GeneradorIp generador; 
	
	@BeforeEach
	void setUp() throws Exception {
		generador = new GeneradorIp(); 
	}

	@Test
	void testGenerarNumero() {
	int actual = generador.generarNumero(0, 255);
	assertTrue( 0 <= actual && actual <= 254); 
	}

	@Test
	void testGenerarIp() {
		String actual = generador.generarIp();
		String numero[] = actual.split("\\.");
		assertFalse(numero[0].equals("0") && numero[3].equals("0")); 
	}

}
