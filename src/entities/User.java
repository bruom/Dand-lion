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
	public double xyz[] = new double[3];//de 0,0,0 a 501,501,501 LOCALIZAÇÃO NO BLOCO!
	public int localBlock[] = new int[3];//Bloco atual!!
	public BlockADM blockAdm;//TODO colocar na inicialização

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public User(double[] loc){//Construtor
		this.xyz=loc;//Seta a localização do usuário
		//blockAdm.centralizaMatriz();
		blockAdm = new BlockADM();
		blockAdm.geraBlocos();


	}//User

	//-------------------------------------------------

	public void update() {
		// TODO Auto-generated method stub

	}//update



}//User