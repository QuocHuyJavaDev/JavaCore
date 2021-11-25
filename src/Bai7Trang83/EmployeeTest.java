package Bai7Trang83;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee();
		obj1.setFirstName("Huy");
		obj1.setLastName("Le");
		obj1.setLasary(10000000);
		Employee obj2 = new Employee();
		obj2.setFirstName("Long");
		obj2.setLastName("Le");
		obj2.setLasary(7000000);
		// Tổng lương hàng năm
		System.out.println("Tổng lương hàng năm của "+obj1.getLastName()+" "+obj1.getFirstName()+": "+(obj1.getLasary()*12));
		System.out.println("Tổng lương hàng năm của "+obj2.getLastName()+" "+obj2.getFirstName()+": "+(obj2.getLasary()*12));
		//
		// Sau khi tăng 10%
		double l1 = obj1.getLasary();
		double l2 = obj2.getLasary();
		l1 += (obj1.getLasary()*0.1);
		l2 += (obj2.getLasary()*0.1);
		System.out.println("Tổng lương hàng năm sau khi tăng 10% của "
		+obj1.getLastName()+" "+obj1.getFirstName()+": "+(l1*12));
		System.out.println("Tổng lương hàng năm sau khi tăng 10% của "
		+obj2.getLastName()+" "+obj2.getFirstName()+": "+(l2*12));
	}

}
