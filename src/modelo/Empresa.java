package modelo;

import java.util.ArrayList;

public class Empresa implements Empleado {

	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double devolverSalario() {
		double monto = 0;
		for (Empleado empleado : empleados) {
			monto += empleado.devolverSalario();
		}

		return monto;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
}
