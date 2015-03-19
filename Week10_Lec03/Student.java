class Student {
	int id;
	String name;

	Student(int id, String name) {
		id = id;
		name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(321, "Aryan");
		s1.display();
		s2.display();
	}
} 