
public class Coche{

	private String marca;
	private String modelo;
	private int numRuedas;

	public Coche(String marca, String modelo, int numRuedas){
		this.marca=marca;
		this.modelo=modelo;
		this.nuRuedas=numRuedas;
	}

	public void setModelo(String modelo){
		this.modelo=modelo;
	}

	public String getModelo(){
		return this.modelo;
	}

}
