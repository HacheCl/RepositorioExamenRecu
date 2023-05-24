package Default;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadTest {

	@Test
	public void testEjercicioD() {
		int resultado = Utilidad.ejercicioD(0);
		int esperado = 0;
		
	}

	@Test
	public void testEjercicioD2() {
		int resultado = Utilidad.ejercicioD(2);
		int esperado = 4;
		
	}
	@Test
	public void testEjercicioD3() {
		int resultado = Utilidad.ejercicioD(3);
		int esperado = 9;
		
	}
	@Test
	public void testEjercicioD4() {
		int resultado = Utilidad.ejercicioD(4);
		int esperado = 28;
		
	}
	@Test
	public void testEjercicioD5() {
		int resultado = Utilidad.ejercicioD(5);
		int esperado = 125;
		
	}

}