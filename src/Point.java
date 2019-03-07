
public class Point {
	private int x;
	private int h;
	
	public Point(int newX, int newHeight) {
		this.setCoords(newX, newHeight);
	}
	
	public void setCoords(int newX, int newHeight) {
		this.x = newX;
		this.h = newHeight;
	}
	
	public void setX(int newX) {
		if (newX < 0) {
			// throw error
		}
		this.x = newX;
	}
	
	public void setHeight(int newHeight) {
		if (newHeight < 0) {
			// throw error
		}
		this.h = newHeight;
	}
	
	public int[] getCoords() {
		return new int[]{x, h};
	}
}
