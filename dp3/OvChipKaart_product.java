package dp3;

public class OVChipkaart_Product {

	private int ovproductID;
	private OVChipKaart OVChipkaart;
	private Product product;
	private String reisproductStatus;
	private String lastUpdate;

	public OVChipkaart_Product() {
	}

	public int getOvproductID() {
		return ovproductID;
	}

	public void setOvproductID(int ovproductID) {
		this.ovproductID = ovproductID;
	}

	public OVChipKaart getOVChipkaart() {
		return OVChipkaart;
	}

	public void setOVChipkaart(OVChipKaart oVChipkaart) {
		this.OVChipkaart = oVChipkaart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getReisproductStatus() {
		return reisproductStatus;
	}

	public void setReisproductStatus(String reisproductStatus) {
		this.reisproductStatus = reisproductStatus;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}