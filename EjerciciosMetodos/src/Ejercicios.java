import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


import javax.swing.JOptionPane;

public class Ejercicios {
	public void imprimirNombre() {
		String nombre,apellido,apellido2,segundoNombre2;
		String mensaje = "<<<<<¿TIENE USTED SEGUNDO NOMBRE?>>>>> \n";
		mensaje+="1. Si \n";
		mensaje+="2. No \n";
		int segundoNombre = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		switch (segundoNombre) {
		case 1: 
			nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
			segundoNombre2 = JOptionPane.showInputDialog(null, "Ingrese su segundo nombre:");
			apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:");
			apellido2 = JOptionPane.showInputDialog(null, "Ingrese su segundo apellido:");
			System.out.println("¡Hola!, su nombre completo es: "+nombre+" "+segundoNombre2+" "+apellido+" "+apellido2);
			JOptionPane.showMessageDialog(null, "¡Hola!, su nombre completo es: "+nombre+" "+segundoNombre2+" "+apellido+" "+apellido2);
			break;
		case 2:
			nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
			apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:");
			apellido2 = JOptionPane.showInputDialog(null, "Ingrese su segundo apellido:");
			System.out.println("¡Hola!, su nombre completo es: "+nombre+" "+apellido+" "+apellido2);
			JOptionPane.showMessageDialog(null, "¡Hola!, su nombre completo es: "+nombre+" "+apellido+" "+apellido2);
			break;
		}
	}
	public void imprimirMayorQue10(int num){
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
		if(num>10) {
			System.out.println("Su numero es mayor que 10 y es: "+num);
			JOptionPane.showMessageDialog(null, "Su numero es mayor que 10 y es: "+num);
		
			}
		}while(num<=10);
	}
	public int generarNumeroAleatorio() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1;
		return numeroAleatorio;
	}
	public int retornarValorMaximo(int[]arr) {
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			return max;
		}
	public int retornarValorMaximoLista(ArrayList<Integer> arr) {
		int max = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i)>max) {
				max = arr.get(i);
			}
		}
		return max;
	}
	public void diccionario() {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("Hi", "Hola");
		diccionario.put("Dog", "Perro");
		diccionario.put("Cat", "Gato");
		diccionario.put("Chair", "Silla");
		diccionario.put("Table", "Mesa");
		diccionario.put("Fridge", "Nevera");
		diccionario.put("Basement", "Atico");
		diccionario.put("Escalator", "Elevador");
		String mensaje = "<<<PALABRAS DISPONIBLES>>> \n";
		mensaje+= "Hi \n";
		mensaje+= "Dog \n";
		mensaje+= "Cat \n";
		mensaje+= "Chair \n";
		mensaje+= "Table \n";
		mensaje+= "Fridge \n";
		mensaje+= "Basement \n";
		mensaje+= "Escalator \n";
		String opc = JOptionPane.showInputDialog(mensaje);
		JOptionPane.showMessageDialog(null, "En espaniol significa: "+diccionario.get(opc));
		System.out.println("En espaniol significa: "+diccionario.get(opc));
	}
	public void estudiantes() {
		HashMap<String, ArrayList<Double>> estudiantes = new HashMap<String, ArrayList<Double>>();
		String menu = "<<<<OPCIONES>>>>\n";
    	menu+="1. Agregar estudiantes\n";
    	menu+="2. Consultar Notas\n";
    	menu+="3. Salir\n";
    	menu+="Ingrese una opción";
    	int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    	String nombre;
    	ArrayList<Double> notasList;
    	do {
			switch (opcion) {
			case 1:
				int cantEst = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea ingresar"));
				for (int i = 0; i < cantEst; i++) {
					nombre = JOptionPane.showInputDialog("Ingrese el nombre de el alumno");
					notasList = new ArrayList<Double>();
					int cantNot = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas desea ingresar para " + nombre));
			    	double nota;
				
			    	for (int j = 0; j < cantNot; j++) {
						nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (j+1) + " para " + nombre));
						notasList.add(nota);
					}
					estudiantes.put(nombre, notasList);
					System.out.println(nombre + " = " + notasList);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;
				
			case 2:
				String nombreConsulta=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
				if (estudiantes.containsKey(nombreConsulta)) {
					ArrayList<Double> listaNotasTemporales = estudiantes.get(nombreConsulta);
					System.out.println("Nombre: "+nombreConsulta);
					
					double sum=0;
					System.out.println("Lista de notas: ");
					for (int i = 0; i < listaNotasTemporales.size(); i++) {
						System.out.print(listaNotasTemporales.get(i)+",");
						sum+=listaNotasTemporales.get(i);
					}
					
					double prom=sum/listaNotasTemporales.size();
					System.out.println("\nEl Promedio es: "+prom);
				}else {
					System.out.println("No se encuentra el estudiante: "+nombreConsulta);
				}
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				break;

			default:
				break;
			}
		} while (opcion != 3);
    }
		
	public int[] sumaArreglos(int[] arr1, int[] arr2) {
        int resultado[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] + arr2[i];
        }
        return resultado;
    }
}
	

