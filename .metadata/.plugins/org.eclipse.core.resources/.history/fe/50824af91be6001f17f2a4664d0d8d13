package boletin2;

public class StudentNote {
	String name;
	String surname;
	String email;
	AsignatureNote progNote;
	AsignatureNote baseDtNote;

	public StudentNote(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentNote [name=" + name + ", email=" + email + "]";
	}

	void printIfPass(){
		System.out.println("El alumno "+ name+ " ha aprobado " + progNote.passQuarter());
		System.out.println("El alumno "+ name+ " ha aprobado " + baseDtNote.passQuarter());
	}
}