package entities;
//Classe que rege o usuário

public class User {
	
	public double xyz[] = new double[3];//de 0,0,0 a 501,501,501 LOCALIZAÇÃO NO BLOCO!
	public int localBlock[] = new int[3];//Bloco atual!!
	public BlockADM blockAdm;//TODO colocar na inicialização
	
	public User(double[] loc){//Construtor
		this.xyz=loc;//Seta a localização do usuário
		//blockAdm.centralizaMatriz();
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();
		
		
	}//--

	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

	
	
}