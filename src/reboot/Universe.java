package reboot;

public class Universe {
	
	public static Quadrant quadrante;
	public static User usuario;
	
	public static void main(String[] args) {
		quadrante = new Quadrant(10, 10, 10, 10);
		
		printStars();

	}

	private static void printStars() {
		
		for(int i = 0; i< quadrante.starsNumber;i++){
			System.out.println(i+"ª Estrela:");
			System.out.println("Nome: "+quadrante.starsArray[i].systemName);
			System.out.println("X: "+quadrante.starsArray[i].xCoord);
			System.out.println("Y: "+quadrante.starsArray[i].yCoord);
			System.out.println("Z: "+quadrante.starsArray[i].zCoord);
			System.out.println("SeedLocal: "+quadrante.starsArray[i].localSeed);
			System.out.println("====================================================");
		}
		
	}

}
