
public class Electrodomestico {

	
	protected double precio;
	protected String color;
	protected String consumo;
	private double peso;
	
	final int price = 100;
	final String colour = "blanco";
	final String consumption = "F";
	final double weight = 5;
	
	public Electrodomestico() {
		
		this.precio = price;
		this.color = colour;
		this.consumo = consumption;
		this.peso = weight;
		
	}
	
public Electrodomestico(double precio, double peso) {
		
		this.precio = precio;
		this.color = colour;
		this.consumo = consumption;
		this.peso = peso;
		
	}

public Electrodomestico(double precio, String color, String consumo, double peso) {
	
		this.precio = precio;
		
		color = color.toLowerCase();
		
		if(color.equals("blanco")||color.equals("negro")||color.equals("rojo")||color.equals("azul")||color.equals("gris")) {
		this.color = color;
		}else {
			this.color= colour;
		}
		this.consumo = consumo;
		this.peso = peso;
		
}
}
