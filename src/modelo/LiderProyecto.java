package modelo;

import java.util.ArrayList;

public class LiderProyecto implements Empleado {
	ArrayList<Empleado> empleadoRegular = new ArrayList<Empleado>();
	public double salario;

	public LiderProyecto(double salario) {
		this.salario = salario;
	}

	@Override
	public double devolverSalario() {
		double monto = this.salario;
		for (Empleado empleado : empleadoRegular) {
			monto += empleado.devolverSalario();
		}

		return monto;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		empleadoRegular.add(empleado);
	}

}
