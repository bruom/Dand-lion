package entities;
//MegaBlocos responsáveis por alocar os sistemas locais

public class MegaBloco {
	
	public long seed;
	public final int aresta = 500;//Define a aresta do Bloco
	public long coord[] = new long[3];//Define a coordenada do bloco na galáxia
	
	public MegaBloco(long paramCoord[]){
		
		this.coord=paramCoord;
		
		
	}

}
