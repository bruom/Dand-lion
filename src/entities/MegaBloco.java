package entities;
/*
 * Classe responsavel por alocar os MegaBlocos.
 * 
 * Ela guarda todas as informa��es dos blocos, coordenadas dos sistemas,
 * seeds dos mesmos etc.
 * 
 * � usada pela BlockADM.
 *
 */

public class MegaBloco {

	//  ATRIBUTOS!
	public long seed;
	public long id;
	public final int aresta = 500;//Define a aresta do Bloco
	public long coord[] = new long[3];//Define a coordenada do bloco na gal�xia
	public int idLocal;//Determina o id do bloco na matriz atual, DINAMICO!!

	//-------------------------------------------------
	//  M�todos!
	//-------------------------------------------------

	public MegaBloco(long paramCoord[]){//M�todo construtor!

		this.coord=paramCoord;



	}//MegaBloco

	//-------------------------------------------------

	public void gerarEstrelas() {
		// TODO Auto-generated method stub

	}//gerarEstrelas



}//MegaBloco
