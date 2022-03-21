package baithuchanh8;

public abstract class QuanCo {

	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public abstract boolean canMoveTo (int xx, int yy);
	public abstract void moveTo (int xx, int yy);
	
	
}
