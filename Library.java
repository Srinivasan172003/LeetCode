package libraryMangementSystem;

class Library {

	private int id;
	private String name;
	private int rollNo;
	private long phoneNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Library(int id, String name, int rollNo, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
	}

	public Library() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", phoneNo=" + phoneNo + "]";
	}
}