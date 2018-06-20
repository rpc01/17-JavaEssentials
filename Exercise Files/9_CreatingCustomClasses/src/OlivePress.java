import java.util.List;
import model.Olive;

public class OlivePress {
	
	public int getOil(List<Olive>olives) {
		int totalOil = 0;
		for(Olive o : olives) {
		totalOil += o.getOil();
		};
		System.out.println(totalOil);
		for(Olive o : olives) {
			System.out.println(o.getName());
			}
		return 0;
	}
}
