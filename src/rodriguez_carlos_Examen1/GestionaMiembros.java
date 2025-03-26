package rodriguez_carlos_Examen1;

public class GestionaMiembros {

	public static void main(String[] args) {
		MiembroEstandar ms1 = new MiembroEstandar("email1@miembrobase.com", "Pepe", null, 1, 30);
		MiembroEstandar ms2 = new MiembroEstandar("email2@miembrobase.com", "Carlos", null, 2, 20);
		
		MiembroPremiun mp1 = new MiembroPremiun("email3@miembropremiun.com", "Maria", null, 3, 10, TipoPremiun.PREMIUN);
		MiembroPremiun mp2 = new MiembroPremiun("email3@miembropremiun.com", "Roberto", null, 4, 50, TipoPremiun.PREMIUN_VIP);
		
		System.out.println(ms1);
		System.out.println(ms2);
		
		System.out.println(mp1);
		System.out.println(mp2);

		MiembroBase[] miembrosEstandar = new MiembroBase[2];
	}

}
