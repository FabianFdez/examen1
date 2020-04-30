
public final class PruebaPCR implements PruebaCovid19 {//Polimorfismo
	public Paciente pacient;
	public PruebaPCR(Paciente paciente) {//Inyeccion de dependencias
		this.pacient = paciente;
	}
	@Override
	public boolean isPositiveCase() {
		// TODO Auto-generated method stub
		//Principio de Programacion
		if(pacient.getTemperatura() >= 39 || pacient.getVomito()) 
		{
			return true;
		}else 
		return false;
	}

	@Override
	public String getNombrePaciente() {
		// TODO Auto-generated method stub
		return pacient.getNombre();
	}

}
