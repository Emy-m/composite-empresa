package modelo;

public class EmpleadoRegular implements Empleado {
	public double salario;

	public EmpleadoRegular(double salario) {
		this.salario = salario;
	}

	@Override
	public double devolverSalario() {
		return this.salario;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
	}

}
