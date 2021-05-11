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

		empresa.a�adirEmpleado(director);
		director.a�adirEmpleado(gerente);
		gerente.a�adirEmpleado(mandoMedio);
		mandoMedio.a�adirEmpleado(liderProyecto);
		liderProyecto.a�adirEmpleado(empleadoRegular);

		System.out.println(empresa.devolverSalario());
	}

}
