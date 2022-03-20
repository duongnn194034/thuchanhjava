package baithuchanh8;

public class Tuong extends QuanCo {
	private final int symbol = 1;
	public Tuong() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSymbol () {
		return symbol;
	}
	
	@Override
	public boolean canMoveTo (int xx, int yy) {
		if((xx - this.getX() < 2) && (xx - this.getX() > -2) &&
				(yy - this.getY() < 2) && (yy - this.getY() > -2)) return true;
		else return false;
	}

	@Override
	public void moveTo (int xx, int yy) {
		if(canMoveTo(xx, yy)) {
			this.setX(xx);
			this.setY(yy);
		}

	}

	
	

}
