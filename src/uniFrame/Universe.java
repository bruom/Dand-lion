package uniFrame;

import java.util.Scanner;

import debug.DebugPrinter;

public class Universe {

	public static Quadrant quadrante;
	public static User usuario;

	public static void main(String[] args) {
		DebugPrinter debugprinter = new DebugPrinter();
		Scanner s = new Scanner(System.in);
		
		
		int x,y,z;
		debugprinter.printBar();
		debugprinter.printMsg("Entre com o X");
		x=s.nextInt();
		debugprinter.printMsg("Entre com o Y");
		y=s.nextInt();
		debugprinter.printMsg("Entre com o Z");
		z=s.nextInt();
		quadrante = new Quadrant(x, y, z);

		quadrante.setup();






		debugprinter.printBar();
		debugprinter.printStars(quadrante);

		s.close();





	}


}
