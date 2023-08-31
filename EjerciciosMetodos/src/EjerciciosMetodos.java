import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjerciciosMetodos {
	public static void main(String arg[]) {
		int[] arr = new int[10];
		int opcion;
		ArrayList<Integer>arr2 = new ArrayList<Integer>();
		String msj = "<<<<LLENAR LISTA>>>> \n";
		msj+="1. Ingresar un nuevo elemento \n";
		msj+="2. Finalizar \n";
		msj+="Ingrese su opcion: \n";
		opcion = Integer.parseInt(JOptionPane.showInputDialog(msj));
		
		do {
			arr2.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un elemento para la lista: ")));
			opcion = Integer.parseInt(JOptionPane.showInputDialog(msj));
		}while(opcion != 2);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para el arreglo en la posicion "+i+":"));
		}
		Ejercicios misEjercicios = new Ejercicios();
		misEjercicios.imprimirNombre();
		misEjercicios.imprimirMayorQue10(7);
		int numeroAleatorio = misEjercicios.generarNumeroAleatorio();
		System.out.println("Su numero aleatorio entre 1 y 100 es: "+numeroAleatorio);
		int numeroMax = misEjercicios.retornarValorMaximo(arr);
		System.out.println("El numero maximo del arreglo es: "+numeroMax);
		int numeroMaxList = misEjercicios.retornarValorMaximoLista(arr2);
		System.out.println("El numero maximo de la lista es: "+numeroMaxList);
		misEjercicios.diccionario();
		misEjercicios.estudiantes();
	}

	
}
