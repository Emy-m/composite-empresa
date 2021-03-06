package main;

import modelo.Director;
import modelo.EmpleadoRegular;
import modelo.Empresa;
import modelo.Gerente;
import modelo.LiderProyecto;
import modelo.MandoMedio;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Laser X");

		Director director = new Director(100);
		Gerente gerente = new Gerente(90);
		MandoMedio mandoMedio = new MandoMedio(80);
		LiderProyecto liderProyecto = new LiderProyecto(70);
		EmpleadoRegular empleadoRegular = new EmpleadoRegular(60);

		empresa.aņadirEmpleado(director);
		director.aņadirEmpleado(gerente);
		gerente.aņadirEmpleado(mandoMedio);
		mandoMedio.aņadirEmpleado(liderProyecto);
		liderProyecto.aņadirEmpleado(empleadoRegular);

		System.out.println(empresa.devolverSalario());
	}

}
