import model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Olive> olives =new ArrayList<>();
		Olive olive1 = new Olive();
		olives.add(olive1);
//		Olive olive2 = new Olive();
//		olives.add(olive2);
		Olive olive3 = new Olive();
		olives.add(olive3);
		olive3.setOil(1);
		olive3.setName("Gordal");
		Olive olive4 = new Olive(Olive.ARB, 0x000000, 1);
		olives.add(olive4);
		Olive olive5 = new Olive("Arbequina", 0x000000, 24);
		olives.add(olive5);
		Olive olive6 = new Olive();
		olives.add(olive6);
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
	}

}
