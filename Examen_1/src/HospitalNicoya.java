
public class HospitalNicoya extends OMS {//herencia y polimorfismo
	public HospitalNicoya(String paciente) {//Inyeccion
		super(paciente);
		// TODO Auto-generated constructor stub
	}

	//Sobreescritura
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
