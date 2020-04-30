
abstract class OMS{//Polimorfismo
	Paciente pacient;
	private String paciente;
	OMS org;
	public OMS(String paciente) {//inyeccion de dependencia
		paciente = "Fabian";
		paciente = "Andres";
		paciente = "Juan";
		
	}
	//Encapsulamiento
	protected abstract boolean isGamHospital();
	//encapsulamiento
	abstract String getNombreHospital();
	//Composicion
	private void diagnosticar() {
		if(org.isGamHospital()) {
			System.out.println("Se aplica la prueba: ");
		}else
			System.out.println("Se aplica la prueba: ");
	};
	//inmutable
	public final void imprimirReporte() {
		System.out.println("Nombre del Hospital: "+org.getNombreHospital());
	}
	
}
