package entities;
//MegaBlocos respons�veis por alocar os sistemas locais

public class MegaBloco {
	
	public long seed;
	public final int aresta = 500;//Define a aresta do Bloco
	public long coord[] = new long[3];//Define a coordenada do bloco na gal�xia
	
	public MegaBloco(long paramCoord[]){
		
		this.coord=paramCoord;
		
		
	}

}
