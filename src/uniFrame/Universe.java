package uniFrame;

import debug.DebugPrinter;

public class Universe {
	
	public static Quadrant quadrante;
	public static User usuario;
	
	public static void main(String[] args) {
		
		quadrante = new Quadrant(94, 101, 6);
		
		quadrante.setup();
		
		
		DebugPrinter debugprinter = new DebugPrinter();
		
		debugprinter.printBar();
		debugprinter.printStars(quadrante);
		
		
		
		

	}


}
