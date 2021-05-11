package modelo;

import java.util.ArrayList;

public class Gerente implements Empleado {
	ArrayList<Empleado> mandoMedio = new ArrayList<Empleado>();
	public double salario;

	public Gerente(double salario) {
		this.salario = salario;
	}

	@Override
	public double devolverSalario() {
		double monto = this.salario;
		for (Empleado empleado : mandoMedio) {
			monto += empleado.devolverSalario();
		}

		return monto;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		mandoMedio.add(empleado);
	}

}
