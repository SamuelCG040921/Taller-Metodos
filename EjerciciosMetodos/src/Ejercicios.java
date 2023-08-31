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
		HashMap<String, Double> estudiantes = new HashMap<String, Double>();
		String mnsj = "<<<<MENU DE OPCIONES>>>> \n";
		mnsj+= "1. Agregar estudiante \n";
		mnsj+= "2. Consultar nota de un estudiante \n";
		mnsj+= "3. Ver todos los estudiantes \n";
		mnsj+= "4. Salir \n";
		mnsj+= "Ingrese su opcion: \n";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(mnsj));
		do {
			switch (opc) {
			case 1: 
				estudiantes.put(JOptionPane.showInputDialog("Ingrese el nombre del estudiante: "), Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante")));
				opc = Integer.parseInt(JOptionPane.showInputDialog(mnsj));
				break;
			
			case 2:
				
				JOptionPane.showMessageDialog(null, estudiantes.get(JOptionPane.showInputDialog("Ingrese el nombre del estudiantes")));
				opc = Integer.parseInt(JOptionPane.showInputDialog(mnsj));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Todos sus estudiantes con sus notas son: \n"+estudiantes);
				opc = Integer.parseInt(JOptionPane.showInputDialog(mnsj));
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				break;
			}
		}while(opc != 4);
		}
	
}
	

