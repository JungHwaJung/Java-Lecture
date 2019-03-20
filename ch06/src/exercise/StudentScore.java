package exercise;

public class StudentScore {
	String name;
	int mat;
	int eng;
	int sci;
	double avg;
	
	StudentScore(String name, int mat, int eng, int sci) {
		this.name = name;
		this.mat = mat;
		this.eng = eng;
		this.sci = sci;
	}
	
	double average() {
		avg = (double)(mat + eng + sci) / 3;
		return avg;
	}
	
	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", mat=" + mat + ", eng=" + eng + ", sci=" + sci + ", avg=" + avg + "]";
	}
	
}
