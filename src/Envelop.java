import java.util.List;

public abstract class Envelop {
	protected List<Point> points;
	protected List<Bar> barStaging;
	
	public Envelop(List<Bar> bars) {
		this.addBars(bars);
	}
	
	public void addBars(List<Bar> bars) {
		barStaging.addAll(bars);
	}
	
	public void addBar(Bar singleBar) {
		barStaging.add(singleBar);
	}
	
	public abstract void update();
	
	//public String toString() {
	//	String toReturn = "";
	//}
}
