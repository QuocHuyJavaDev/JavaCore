package GameDoanSo;

public class Player {
	int number = 0;
	public void guess() {
		// TODO Auto-generated method stub
		number = (int) (Math.random()*10);
		System.out.println("I'm guessed "+number);
	}
}
