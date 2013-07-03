package entities;
//MegaBlocos responsáveis por alocar os sistemas locais

public class MegaBloco {
	
	public long seed;
	public long id;
	public final int aresta = 500;//Define a aresta do Bloco
	public long coord[] = new long[3];//Define a coordenada do bloco na galáxia
	public int idLocal;//Determina o id do bloco na matriz atual, DINAMICO!!
	
	public MegaBloco(long paramCoord[]){
		
		this.coord=paramCoord;
		
		
		
	}

	public void gerarEstrelas() {
		// TODO Auto-generated method stub
		
	}

}
