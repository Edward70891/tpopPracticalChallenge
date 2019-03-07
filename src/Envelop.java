import java.util.ArrayList;
import java.util.List;

public class Envelop {
	private ArrayList<Point> points;
	
	public Envelop() {
		
	}
	public Envelop(List<Bar> bars) {
		this.addBars(bars);
	}
	
	public void addBars(List<Bar> bars) {
		
	}
	
	public void addBar(Bar singleBar) {
		List<Bar> singleBarList = new ArrayList<Bar>();
		this.addBars(singleBarList);
	}
}
