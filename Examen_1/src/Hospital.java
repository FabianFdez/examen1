
public enum Hospital
{;
	//encapsulamiento
	private String mexico = "Hospital Mexico";
	private String nicoya = "Hospital de Nicoya";
	//encapsulamiento
	private Hospital (String mexico, String nicoya) {//inyeccion de dependencia
		this.mexico = mexico;
		this.nicoya = nicoya;
	}
	
	public String tipo() {//Principio de programacion
		return mexico ;
	}
}
