package modelo;

import java.util.ArrayList;

public class Director implements Empleado {
	ArrayList<Empleado> gerentes = new ArrayList<Empleado>();
	public double salario;

	public Director(double salario) {
		this.salario = salario;
	}

	@Override
	public double devolverSalario() {
		double monto = this.salario;
		for (Empleado empleado : gerentes) {
			monto += empleado.devolverSalario();
		}

		return monto;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		gerentes.add(empleado);
	}

}
