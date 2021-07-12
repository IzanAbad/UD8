
public class Persona {

	private String nombre;
	private int edad;
	private int DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	final String sex = "h";
	public Persona() {
		
		this.nombre = "";
		this.edad = 0;
		this.DNI = 0;
		this.sexo = sex;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, int DNI,String sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
