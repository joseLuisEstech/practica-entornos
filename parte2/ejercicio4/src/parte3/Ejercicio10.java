package parte3;
import java.util.Arrays;


public class Ejercicio10 {
	public static void main(String[] args) {

		int array[] = { 5, 8, 3, 4, 1, 10, 4, 0, 7, -3 };
		System.out.println(Arrays.toString(array));

		int result[] = { 3, 1, 4, 4, 0, 5, -3, 7, 8, 10 };

		System.out.println("Array original: " + Arrays.toString(array));
		System.out.println("Array de muestra: " + Arrays.toString(result));

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}

		System.out.println("Array ordenado: " + Arrays.toString(array));

	}
}
