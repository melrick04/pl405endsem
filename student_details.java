package hibernate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_DETAIL")
public class student_details{
	
	@Id @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = { @Parameter(value = "student", name = "property")})
	private int student_id;
	
	@Column(name="COURSE_1_Marks",nullable=true)
	private String c1;
	
	@Column(name="COURSE_2_Marks",nullable=true)
	private String c2;
	
	@Column(name="COURSE_3_Marks",nullable=true)
	private String c3;
	
	@Column(name="COURSE_4_Marks",nullable=true)
	private String c4;
	
	@Column(name="COURSE_5_Marks",nullable=true)
	private String c5;
	
	@Column(name="COURSE_6_Marks",nullable=true)
	private String c6;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private student student;
	
	public student getStudent() {
		return student;
	}

	public void setStudent(student student) {
		this.student = student;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getC5() {
		return c5;
	}

	public void setC5(String c5) {
		this.c5 = c5;
	}

	public String getC6() {
		return c6;
	}

	public void setC6(String c6) {
		this.c6 = c6;
	}

	

	

	
	

}
