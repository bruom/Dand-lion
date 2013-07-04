package entities;

/*
 * Classe responsavel por gerenciar a galáxia.
 * 
 * Fornece os dados sobre o formato da mesma.
 * 
 * 
 */

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Galaxia {

	//  ATRIBUTOS!
	static BufferedImage mainMap;//Buffer do mapa geral
	String mainMapName = "\\dat\\topMap";//Caminho do mapa geral e nome do mesmo

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public Galaxia(){//Método construtor



	}//Galaxia

	//-------------------------------------------------



	public int getNumeroDeEstrelas(int x,int y,int z){

		try {
			mainMap = ImageIO.read(new File(mainMapName+".jpg"));
		} catch (IOException e) {
		}

		double p=0;
		int estrelas=0;
		p=(-4*((y-5)*(y-5))+100);
		estrelas = (int) ((p/100)*((0.004/8947848)*500*500*500*Math.abs(mainMap.getRGB(z,x))));

		return estrelas;

	}//getNumeroDeEstrelas



}//Galaxia
