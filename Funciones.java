package Pruebas;

public class Funciones {
	
	/*Funcion que comprueba si un numero es divisible entre X .*/
	static boolean Funcion1(int x) {
		int y = 1;
		if(y % x == 0 ) {
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Resultado Funcion 1: " +Funcion1(1));
	}
}
