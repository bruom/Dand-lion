package reboot;

public class Quadrant {

	public int xCoord,yCoord,zCoord;
	public String quadrantName;
	double localSeed;
	public int starsNumber;
	public StarSystems[] starsArray;

	public Quadrant(int starsnumber,int xcoord,int ycoord,int zcoord){
		this.starsNumber = starsnumber;
		this.xCoord = xcoord;
		this.yCoord = ycoord;
		this.zCoord = zcoord;
		this.localSeed=(this.xCoord+2*this.yCoord+3*this.zCoord);
		this.quadrantName = (this.xCoord+"-"+this.yCoord+"-"+this.zCoord);
		igniteStars();
	}
	
	
	public void igniteStars(){
		this.starsArray = new StarSystems[this.starsNumber];
		double X=generateCoord(this.localSeed);
		for(int i=0;i<this.starsArray.length;i++){
			//Atribui cada coordenada
			this.starsArray[i].xCoord=generateCoord(X);
			X=this.starsArray[i].xCoord;
			this.starsArray[i].yCoord=generateCoord(X);
			X=this.starsArray[i].yCoord;
			this.starsArray[i].zCoord=generateCoord(X);
			X=this.starsArray[i].zCoord;
			//Atribui a Seed
			this.starsArray[i].localSeed=(this.starsArray[i].xCoord+2*this.starsArray[i].yCoord+3*this.starsArray[i].zCoord);
			//Atribui nome
			this.starsArray[i].systemName=(this.quadrantName+"-"+this.starsArray[i].localSeed);
		}
	}
	
	public double generateCoord(double Xi){
		int a = 25136;
		int b = 25256;
		int m = 500000;
		return (((a*Xi+b)%m)/1000);
	}
}
