package baithuchanh9;
import java.util.*;

public class DaThuc {
	private LinkedList<HangTu> hangTu;
	private Map<int, int> indexs;
	private static int index = 1;
	public DaThuc (HangTu ht) {
		this.hangTu = new LinkedList<HangTu>();
		this.hangTu.add(ht);
	}
	public void add (HangTu ht) {
		this.hangTu.add(ht);
	}
	public void mutiple (HangTu ht) {
		for(HangTu x : hangTu) {
			x.setHeSo(x.getHeSo() * ht.getHeSo());
			x.setSoMu(x.getSoMu() + ht.getSoMu());
		}
	}
	
	public void add (DaThuc dt) {
		for(HangTu x : dt.hangTu) {
			this.hangTu.add(x);
		}
	}
}
