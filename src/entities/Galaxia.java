package entities;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Galaxia {
	BufferedImage topMap = null;//ImageIO.read(new File("topMap.jpg"));//mapa que define a galaxia (vista de cima)
	BufferedImage sideMap = null;//ImageIO.read(new File("sideMap.jpg"));//mapa que define a galaxia (perfil)

	public Galaxia(String instancerTopMap,String instancerSideMap){
		caregaMapas();



	}

	public void caregaMapas() {
		try {
			topMap = ImageIO.read(new File("dat\\topMap.jpg"));
		} catch (IOException e) {
		}
		
		try {
			sideMap = ImageIO.read(new File("dat\\sideMap.jpg"));
		} catch (IOException e) {
		}

	}


	public static double getDensidadeDeEstrelas(){
		
	}
	//image.getRGB(x,y);

}
