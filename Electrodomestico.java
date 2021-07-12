
public class Electrodomestico {

	
	protected double precio;
	protected String color;
	protected String consumo;
	protected double peso;
	
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
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		
}
}
