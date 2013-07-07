package reboot;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class GalaxyMapper {

	BufferedImage topMap = null;

	GalaxyMapper(){}

	public int getStarsNumber(int xcoord,int ycoord,int zcoord){
		
		double p=0;
		
		try {
			this.topMap = ImageIO.read(new File(".\\dat\\MainMap.jpg"));
		} catch (IOException e) {
			System.err.println(e);
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
