package entities;
//Classe que rege o usu�rio

public class User {
	
	public double xyz[] = new double[3];//de 0,0,0 a 501,501,501 LOCALIZA��O NO BLOCO!
	public int localBlock[] = new int[3];//Bloco atual!!
	public BlockADM blockAdm;//TODO colocar na inicializa��o
	
	public User(double[] loc){//Construtor
		this.xyz=loc;//Seta a localiza��o do usu�rio
		//blockAdm.centralizaMatriz();
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();
		
		
	}//--

	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

	
	
}