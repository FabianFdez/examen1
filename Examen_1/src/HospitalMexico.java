
public class HospitalMexico extends OMS {//Herencia y polimorfismo
	public HospitalMexico(String paciente) {//Inyeccion
		super(paciente);
		// TODO Auto-generated constructor stub
	}

	//Sobrescritura
	@Override
	protected boolean isGamHospital() {//encapsulamiento
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	String getNombreHospital() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
