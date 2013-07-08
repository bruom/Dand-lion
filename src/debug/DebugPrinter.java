package debug;

import uniFrame.*;

public class DebugPrinter {
	
	public DebugPrinter(){
		System.out.println("DebugPrinter Criado!");
		printBar();
	}

	public void printStars(Quadrant quadrante) {


		for(int i = 0; i< quadrante.starsNumber;i++){
			System.out.println((i+1)+"ª Estrela:");
			System.out.println("Nome: "+quadrante.starsArray[i].systemName);
			System.out.println("X: "+quadrante.starsArray[i].xCoord);
			System.out.println("Y: "+quadrante.starsArray[i].yCoord);
			System.out.println("Z: "+quadrante.starsArray[i].zCoord);
			System.out.println("SeedLocal: "+quadrante.starsArray[i].localSeed);
			printBar();
		}

	}
	
	public void printBar(){
		System.out.println("======================================================");
	}
	
	public void printMsg(String msg){
		System.out.println(msg);
	}

}
