
public class Password {

	private int longitud;
	private String contraseņa;
	
	
	public Password(String contraseņa) {
		
		this.longitud = 8;
		this.contraseņa = contraseņa;
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		int prueba ;
		for (int i = 0; i < 50; i++) {
            prueba=(int) (Math.random()*9999+1); 
            System.out.print(prueba+"  ");
        }
		
		
	}
	
}
