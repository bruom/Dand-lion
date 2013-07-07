package reboot;

public class Universe {
	
	//public Quadrant quadrante;
	public User usuario;//Ainda não usado
	
	public static void main(String[] args) {
		
		Quadrant quadrante = new Quadrant(10, 10, 10, 10);//Cria o quadrante
		
		printStars(quadrante);

	}

	private static void printStars(Quadrant q) {//Printa as estrelas e seus atributos.
		
		for(int i = 0; i< q.starsNumber;i++){
			System.out.println(i+"ª Estrela:");
			System.out.println("Nome: "+q.starsArray[i].systemName);
			System.out.println("X: "+q.starsArray[i].xCoord);
			System.out.println("Y: "+q.starsArray[i].yCoord);
			System.out.println("Z: "+q.starsArray[i].zCoord);
			System.out.println("SeedLocal: "+q.starsArray[i].localSeed);
			System.out.println("====================================================");
		}
		
	}

}
