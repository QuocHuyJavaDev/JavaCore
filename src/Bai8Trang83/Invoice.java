package Bai8Trang83;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double unitPrice;
	public Invoice() {
		// TODO Auto-generated constructor stub
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		if (unitPrice < 0) {
			this.unitPrice = 0.0;
		} else {
			this.unitPrice = unitPrice;
		}
		
	}
	//
	public double getInvoiceAmount() {
		return getQuantity()*getUnitPrice();
	}
}
