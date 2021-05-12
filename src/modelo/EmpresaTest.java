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

		empresa.añadirEmpleado(director);
		director.añadirEmpleado(gerente);
		gerente.añadirEmpleado(mandoMedio);
		mandoMedio.añadirEmpleado(liderProyecto);
		liderProyecto.añadirEmpleado(empleadoRegular);

		assertEquals(400, empresa.devolverSalario());
	}
}
