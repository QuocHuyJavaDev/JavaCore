package Bai8Trang83;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice nv1 = new Invoice();
		nv1.setPartNumber("H01");
		nv1.setPartDescription("Tivi");
		nv1.setQuantity(10);
		nv1.setUnitPrice(5000000);
		
		Invoice nv2 = new Invoice();
		nv2.setPartNumber("H02");
		nv2.setPartDescription("Tu lanh");
		nv2.setQuantity(20);
		nv2.setUnitPrice(3000000);
		
		System.out.println("Mặt hàng 1");
		System.out.println("Số hiệu: "+nv1.getPartNumber());
		System.out.println("Tên mặt hàng: "+nv1.getPartDescription());
		System.out.println("Số lượng: "+nv1.getQuantity());
		System.out.println("Đơn giá: "+nv1.getUnitPrice());
		System.out.println("Tổng đơn: "+nv1.getInvoiceAmount());
		System.out.println("=========================================");
		System.out.println("Mặt hàng 2");
		System.out.println("Số hiệu: "+nv2.getPartNumber());
		System.out.println("Tên mặt hàng: "+nv2.getPartDescription());
		System.out.println("Số lượng: "+nv2.getQuantity());
		System.out.println("Đơn giá: "+nv2.getUnitPrice());
		System.out.println("Tổng đơn: "+nv2.getInvoiceAmount());
	}

}
