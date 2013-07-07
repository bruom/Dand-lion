package reboot;

public class StarSystems {
	
	public double xCoord,yCoord,zCoord;
	public String systemName;
	double localSeed;
	public SystemsObjects[] objectsArray;
	
	public StarSystems(){
		System.out.println("Estrela Criada!");
	}
	
	public void setCoordX(double coord){
		this.xCoord = coord;
	}
	
	public void setCoordY(double coord){
		this.yCoord = coord;
	}
	
	public void setCoordZ(double coord){
		this.zCoord = coord;
	}

}
