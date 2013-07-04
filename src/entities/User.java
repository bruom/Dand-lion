package entities;

/*
 * lasse que gerencia o usu�rio
 * 
 * Responsavel pelas informa��es do mesmo, como coordenadas, estado,
 * Instancia de aproxima��o etc...
 * 
 */

public class User {

	//  ATRIBUTOS!
	public int quadrante[] = new int[3];//Quadrante atual!
	public int localBlock[] = new int[3];//Bloco atual!!
	public double xyz[] = new double[3];//de 1,1,1 a 500,500,500 LOCALIZA��O NO BLOCO!
	
	
	public BlockADM blockAdm;//TODO colocar na inicializa��o

	//-------------------------------------------------
	//  M�todos!
	//-------------------------------------------------

	public User(double iniXYZ[]){//Construtor
		
		this.xyz=iniXYZ;//Seta a localiza��o do usu�rio no bloco
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();


	}//User

	//-------------------------------------------------

	public void update() {
		// TODO Auto-generated method stub

	}//update



}//User