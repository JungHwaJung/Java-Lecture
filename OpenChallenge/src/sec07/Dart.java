package sec07;

public class Dart {
	int S;
	int D;
	int T;
	
	public Dart(int s, int d, int t) {
		super();
		S = s;
		D = d;
		T = t;
	}

	public int getS() {
		return S;
	}

	public void setS(int s) {
		S = s;
	}

	public int getD() {
		return D^2;
	}

	public void setD(int d) {
		D = d;
	}

	public int getT() {
		return T^3;
	}

	public void setT(int t) {
		T = t;
	}

	@Override
	public String toString() {
		return "Dart [S=" + S + ", D=" + D + ", T=" + T + "]";
	}
}
