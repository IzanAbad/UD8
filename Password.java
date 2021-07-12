import java.util.Random;

public class Password {

	protected int longitud;
	protected String contraseņa;
	
	
	public Password(String contraseņa) {
		
		this.longitud = 8;
		this.contraseņa = contraseņa;
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		String pass="";
		
		for(int i=0; i < longitud; i++) {
			
			 Random random = new Random();
			 char randomizedCharacter = (char) (random.nextInt(26) + 'a');
	         pass+= randomizedCharacter;
		}
		
		this.contraseņa = pass;
		
	}
}
