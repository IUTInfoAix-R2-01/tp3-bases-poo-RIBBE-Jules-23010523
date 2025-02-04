public class Livre {
	private String name;
	private double price;
	private int quantite;
	
	public Livre(String name, double d, int quantite) {
		this.name = name;
		this.setPrice(d);
		this.setQuantite(quantite);
	}
	
	public String Getname(){
		return name;
	}
	
	public void Setname(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	@Override
    public String toString() {
        return "Livre{name='" + name + "', price=" + price + ", quantite=" + quantite + "}";
    }
}
