package boletin_2;

public class StudentNoteMain {

	public static void main(String[] args) {
		StudentNote lucia = new StudentNote("Lucia", "lucia@gmail.com");
		lucia.progNote = new AsignatureNote("Programción", 5, 7, 7);
		lucia.baseDtNote = new AsignatureNote("Base de datos", 6, 6, 7);
		
		StudentNote andres = new StudentNote("Andrés", "andres@gmail.com");
		andres.progNote = new AsignatureNote("Programación", 4, 4, 6);
		andres.baseDtNote = new AsignatureNote("Base de datos", 9, 8, 8);
		
		StudentNote vicente = new StudentNote("Vicente", "vicente@gmail.com");
		vicente.progNote = new AsignatureNote("Programación", 2, 2, 3);
		vicente.baseDtNote = new AsignatureNote("Base de datos", 6, 6, 7);
		
		System.out.println("Nota media de Vicente: " + vicente.progNote.mediaNote());
		vicente.printIfPass();
		lucia.printIfPass();
		
		
	}

}
