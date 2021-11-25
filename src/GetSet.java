
public class GetSet {
	private int tuoi;
	
	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		if (tuoi > 0 && tuoi < 200) {
			this.tuoi = tuoi;	
		}
	}
	void display() {
		if (tuoi < 1) {
			System.out.println("Sơ sinh");
		} else if(tuoi >1 && tuoi<15) {
			System.out.println("Thiếu niên");
		} else {
			System.out.println("Già");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet n1 = new GetSet();
		n1.setTuoi(5);
		n1.display();
		System.out.println(n1.getTuoi());
	}

}
