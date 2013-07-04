package entities;

public class Seeder {
	
	final double  A = 25136;
	double Xi;
	double M = 750000;
	double B = 25256;
	double Xf;
	
	public Seeder(int seed){
		this.Xi=seed;
	}//Seeder
	
	public int semearEstrelas(){
		
		
		
		this.Xf=(this.A*this.Xi+this.B)%500000;
		
		
		return (int)this.Xf/1000;
	}

}
