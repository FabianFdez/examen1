
public final class PruebaRapida implements PruebaCovid19 { //Polimorfismo
	
	public Paciente pacient;
	public PruebaRapida(Paciente paciente) {//Inyeccion de dependencias
		this.pacient = paciente;
	}
	@Override
	public boolean isPositiveCase() {
		// TODO Auto-generated method stub
		if(pacient.getTemperatura() >= 37 || pacient.getEdad() >= 60) 
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
