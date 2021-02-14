/**
 * 
 */
package arrays;

/**
 * @author cesar
 *
 */
public class Arreglos {

	static int arregloDeClase[];
	public static void main(String[] args) {
		int arregloLocal[];
		
		arregloDeClase = new int[10];
		arregloLocal = new int[20];
		
		for (int i = 0; i < arregloDeClase.length; i++) {
			System.out.println("Estamos en la posición del arreglo: " + i + " Y el valor del arregloDeClase es: " + arregloDeClase[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < arregloLocal.length; i++) {
			System.out.println("Estamos en la posición del arreglo: " + i + " Y el valor del arregloLocal es: " + arregloLocal[i]);
		}
	}
}