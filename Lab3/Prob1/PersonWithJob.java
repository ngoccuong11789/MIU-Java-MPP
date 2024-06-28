package Lab3.Prob1;

public class PersonWithJob {

	private Person person;
	private double salary;

	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
//		super(n);
		this.person = new Person(n);
		salary = s;
	}

	public String getName() {
		return person.getName();
	}

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
//		boolean isEqual = this.getName().equals(p.getName()) &&
//				this.getSalary()==p.getSalary();
		boolean isEqual = this.person.getName().equals(p.getName()) && this.salary == p.getSalary();
		return isEqual;
	}


	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		//Person p1 = new PersonWithJob("Joe", 30000);
		Person p3 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

		System.out.println("p1.equals(p3)? " + p1.equals(p3));
		System.out.println("p3.equals(p1)? " + p3.equals(p1));
	}


}

