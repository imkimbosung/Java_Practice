package num_101112;

public class Num_10_1 {
	String name;
	int stuNum;
	String major;
	int year;
	double grade;

	Num_10_1(String name, int stuNum, String major) {
		this.name = name;
		this.stuNum = stuNum;
		this.major = major;
	}

	Num_10_1(int year, double grade) {
		this.year = year;
		this.grade = grade;
	}

	public String getname() {
		return name;
	}

	public String getmajor() {
		return major;
	}

	public double getgrade() {
		return grade;
	}

	public int getstuNum() {
		return stuNum;
	}

	public int getyear() {
		return year;
	}
}
