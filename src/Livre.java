public class Livre {
	private String name;
	private float price;
	private int quantite;
	
	public Livre(String name, float price, int quantite) {
		this.name = name;
		this.setPrice(price);
		this.setQuantite(quantite);
	}
	
	public String Getname(){
		return name;
	}
	
	public void Setname(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
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
