package modelo;

import java.util.ArrayList;

public class MandoMedio implements Empleado {
	ArrayList<Empleado> liderProyecto = new ArrayList<Empleado>();
	public double salario;

	public MandoMedio(double salario) {
		this.salario = salario;
	}

	@Override
	public double devolverSalario() {
		double monto = this.salario;
		for (Empleado empleado : liderProyecto) {
			monto += empleado.devolverSalario();
		}

		return monto;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		liderProyecto.add(empleado);
	}

}
