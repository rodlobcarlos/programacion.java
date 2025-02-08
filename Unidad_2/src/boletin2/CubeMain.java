package boletin2;

public class CubeMain {

	public static void main(String[] args) {
		Cube cube = new Cube(4,0);
		System.out.println(cube);
	    
		System.err.println(cube.fill_out(6));
		System.out.println(cube);
		
		cube.empty(4);
		System.out.println(cube);
		System.out.println(cube.empty(3));
		System.out.println(cube);
		cube.fill_out(16);
		System.out.println(cube);
	}
}