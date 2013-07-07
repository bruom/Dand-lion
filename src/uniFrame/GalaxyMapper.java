package uniFrame;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class GalaxyMapper {

	BufferedImage topMap = null;
	private  static final String mainMapName = "MainMap.jpg";
	private  static final String datDir = ".\\dat\\";

	GalaxyMapper(){}

	public int getStarsNumber(int xcoord,int ycoord,int zcoord){
		
		double p=0;
		
		try {
			this.topMap = ImageIO.read(new File(datDir+mainMapName));
		} catch (IOException e) {
			System.out.println("============ ERRO!!! ===============");
			System.out.println(">>> Mapa Principal ("+mainMapName+") Não encontrado!");
			System.out.println(">>> Dir: (\""+datDir+mainMapName+"\")");
			System.err.println(e);
			System.out.println("====================================");
			e.printStackTrace();
			System.out.println("====================================");
		}
		
		//p=(-4*((zcoord-5)*(zcoord-5))+100);
		if(zcoord==0||zcoord==6){
			p=0.05;
		}else if(zcoord==1||zcoord==5){
			p=0.3;
		}else if(zcoord==2||zcoord==4){
			p=0.75;
		}else if(zcoord==3){
			p=1;
		}else{
			p=0;
		}
		return (int) ((p/100)*((0.004/8947848)*500*500*500*Math.abs(topMap.getRGB(xcoord,ycoord))));
	}
}
