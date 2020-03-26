package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Funcion1 {


	private static final String y = null;
	static Funciones o = null;
	static int PruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Funciones();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		PruebasRealizadas++;
		System.out.println("Ejecutando test "+ PruebasRealizadas);
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+ PruebasRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		System.out.println("Se han realizado en total: " +PruebasRealizadas);
		o = null;
		
	}
	

	@DisplayName("Test de Caja Negra condicion correcta")
	@Test
	void Prueba2() {
		assertTrue(o.Funcion1(1));
	}
}
