package Default;

/**
 * 
 * @author Jose Garcia
 * @version 1.0
 * @since 24/05/23
 * 
 */
public class Utilidad {

public static void main(String[] args) {
	new Utilidad();
}
	/**
	 * 
	 * @param a parametro para el primer ejercicio casos de prueba
	 * @return si a es 0 devuelve 0 si no devuelve a mas su factorial
	 */
	public static  int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	/**
	 * 
	 * @param n int pasado por parametros para calcular el factorial
	 * @return devuelve 1 si n es igual a 1 si no devuelve n*factorial de n -1
	 */
	
	public static int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	/**
	 * @param a se usara para calcular el valor de c
	 * @param b se usara para calcular el valor de c
	 * @return si el d modulo i es igual a 0 devuelve false si no devuelve true
	 */
	public boolean refactorizacionD(int a, int b) {
		// Borrado de variable redundante
		int numPrimo = a + b + 34;
		
		//Calculo si d es primo
		//Limpieza de codigo eliminando pasos in
		boolean esPrimo = true;
		for (int i=2;i<numPrimo;i++) {
			if (numPrimo%i==0)esPrimo = false;
			}
		// eliminacion de boolean innecesario
		return esPrimo;
	}
}
