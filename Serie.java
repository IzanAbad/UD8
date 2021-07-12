
public class Serie {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	public Serie() {
		
		this.titulo = "";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador="";
		
	}
public Serie(String titulo, String creador) {
		
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador=creador;
		
	}

public Serie(String titulo, int temporadas, String genero, String creador) {
	
	this.titulo = titulo;
	this.temporadas = temporadas;
	this.entregado = false;
	this.genero = genero;
	this.creador=creador;
	
}
	
	
	
}
