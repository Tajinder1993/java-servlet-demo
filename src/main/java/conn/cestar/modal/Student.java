package conn.cestar.modal;

public class Student {
	
	private int stu_id;
	private String name;
	private String dob;
	private String address;
	private String city;
	private String province;
	private String zip;
	private String country;
	private String phone;
	private String email;
	private String password;
	private String course;
	private String comment;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", city="
				+ city + ", province=" + province + ", zip=" + zip + ", country=" + country + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", course=" + course + ", comment=" + comment + "]";
	}
	public Student(int stu_id, String name, String dob, String address, String city, String province, String zip,
			String country, String phone, String email, String password, String course, String comment) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.province = province;
		this.zip = zip;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.course = course;
		this.comment = comment;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
