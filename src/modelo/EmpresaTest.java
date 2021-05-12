package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpresaTest {
	@Test
	public void montoTotalSalarialTest() {
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

		assertEquals(400, empresa.devolverSalario());
	}
}
