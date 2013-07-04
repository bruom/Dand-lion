package entities;

/*
 * lasse que gerencia o usuário
 * 
 * Responsavel pelas informações do mesmo, como coordenadas, estado,
 * Instancia de aproximação etc...
 * 
 */

public class User {

	//  ATRIBUTOS!
	public int quadrante[] = new int[3];//Quadrante atual!
	public int localBlock[] = new int[3];//Bloco atual!!
	public double xyz[] = new double[3];//de 1,1,1 a 500,500,500 LOCALIZAÇÃO NO BLOCO!
	
	
	public BlockADM blockAdm;//TODO colocar na inicialização

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public User(double iniXYZ[]){//Construtor
		
		this.xyz=iniXYZ;//Seta a localização do usuário no bloco
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();


	}//User

	//-------------------------------------------------

	public void update() {
		// TODO Auto-generated method stub

	}//update



}//User