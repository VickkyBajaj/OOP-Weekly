package Week7;

//Parent class: HospitalEmployee
class HospitalEmployee{
	int empId;

	public HospitalEmployee(int empId) {
		this.empId = empId;
	}
}

//Subclass: Doctor
class Doctor extends HospitalEmployee {
	public Doctor(int empId) {
		super(empId);
	}

	public void specialize() {
		System.out.println("Doctor " + empId + " specializes in treatment.");
	}
}

//Subclass: Nurse
class Nurse extends HospitalEmployee {
	public Nurse(int empId) {
		super(empId);
	}

	public void patients() {
		System.out.println("Nurse " + empId + " has patients.");
	}
}

//Subclass: Receptionist
class Receptionist extends HospitalEmployee {
	public Receptionist(int empId) {
		super(empId);
	}

	public void answerCalls() {
		System.out.println("Receptionist " + empId + " is answering calls.");
	}
}

//Subclass: Cleaner
class Cleaner extends HospitalEmployee {
	public Cleaner(int empId) {
		super(empId);
	}

	public void sweep() {
		System.out.println("Cleaner " + empId + " is sweeping.");
	}
}

//Driver class: Hospital
public class Hospital {
	public static void main(String[] args) {
		Doctor doc = new Doctor(1);
		Nurse nurse = new Nurse(4);
		Receptionist recep = new Receptionist(3);
		Cleaner cleaner = new Cleaner(6);

		// Display the output
		doc.specialize();
		nurse.patients();
		recep.answerCalls();
		cleaner.sweep();
	}
}