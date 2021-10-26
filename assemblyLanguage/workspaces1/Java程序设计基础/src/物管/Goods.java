package 物管;
public class Goods {
	private String id;
	private String name;
	private float price;	
	public String getId() {          //source get,set     构造：source  constructe
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Goods() {
		
	}
	public Goods(String id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
