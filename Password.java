import java.util.Random;

public class Password {

	protected int longitud;
	protected String contraseña;
	
	
	public Password(String contraseña) {
		
		this.longitud = 8;
		this.contraseña = contraseña;
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		String pass="";
		
		for(int i=0; i < longitud; i++) {
			
			 Random random = new Random();
			 char randomizedCharacter = (char) (random.nextInt(26) + 'a');
	         pass+= randomizedCharacter;
		}
		
		this.contraseña = pass;
		
	}
}
