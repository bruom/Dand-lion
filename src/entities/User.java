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
	public static int quadrante[] = new int[3];//Quadrante atual!
	public static int localBlock[] = new int[3];//Bloco atual!!
	public static double xyz[] = new double[3];//de 1,1,1 a 500,500,500 LOCALIZAÇÃO NO BLOCO!
	
	
	public static BlockADM blockAdm;

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public User(int quadr[],double iniXYZ[]){//Construtor
		
		User.quadrante=quadr;
		User.xyz=iniXYZ;//Seta a localização do usuário no bloco
		
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();


	}//User

	//-------------------------------------------------

	public void update() {
		// TODO Auto-generated method stub

	}//update



}//User