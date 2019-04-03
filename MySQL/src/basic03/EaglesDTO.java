package basic03;

public class EaglesDTO {
	private int backNo;
	private String name;
	private String position;
	private String hs;
	private String th;
	private String sh;
	private String birth;
	private int income;
	
	public EaglesDTO(int backNo, String name, String position, String hs, String th, String sh, String birth,
			int income) {
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.hs = hs;
		this.th = th;
		this.sh = sh;
		this.birth = birth;
		this.income = income;
	}
	
	public EaglesDTO() { }

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHs() {
		return hs;
	}

	public void setHs(String hs) {
		this.hs = hs;
	}

	public String getTh() {
		return th;
	}

	public void setTh(String th) {
		this.th = th;
	}

	public String getSh() {
		return sh;
	}

	public void setSh(String sh) {
		this.sh = sh;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", hs=" + hs + ", th=" + th
				+ ", sh=" + sh + ", birth=" + birth + ", income=" + income + "]";
	}
	
	
	
}
