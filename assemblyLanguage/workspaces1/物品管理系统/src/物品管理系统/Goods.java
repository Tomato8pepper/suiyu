package 物品管理系统;

public class Goods {
	private String gId;
	private String gName;
	private String gPrice;
	private String Stock;
	public String getgId() {
		return gId;
	}
	public void setgId(String gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgPrice() {
		return gPrice;
	}
	public void setgPrice(String gPrice) {
		this.gPrice = gPrice;
	}
	
	public String getStock() {
		return Stock;
	}
	public void setStock(String stock) {
		this.Stock = stock;
	}
	public Goods(String gId, String gName, String gPrice,String Stock) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.gPrice = gPrice;
		this.Stock=Stock;
	}
	
	


}
