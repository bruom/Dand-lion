package entities;

public class BlockADM {

	public int blocoSfera = 3;//Define quantos blocos ser�o carregados ao mesmo tempo (Quantos blocos cada lado da matriz ter�)
	public MegaBloco matrizDeBlocos[][][];//Retem os blocos em mem�ria
	public int blocoAtual[] = new int[3];//Sendo x, y, z as posi��es

	public void centralizaMatriz() {//Centraliza o usu�rio na matriz, em rela��o aos blocos
		blocoAtual[0]=(int) ((double)(blocoSfera/2)+0.5);
		blocoAtual[1]=(int) ((double)(blocoSfera/2)+0.5);
		blocoAtual[2]=(int) ((double)(blocoSfera/2)+0.5);
	}

	public void geraBlocos() {//Percore a matriz gerando e preenchendo cada bloco
		matrizDeBlocos = new MegaBloco[blocoSfera][blocoSfera][blocoSfera];//Instancia a matriz de blocos
		
		int x=0,y=0,z=0,identificadorLocal=1;//Variaveis de percurs�o
		for(x=0;x<matrizDeBlocos.length;){
			for(y=0;y<matrizDeBlocos[0].length;){
				for(z=0;z<matrizDeBlocos[0][0].length;){
					matrizDeBlocos[x][y][z].idLocal=identificadorLocal;
					

					identificadorLocal++;
					z++;
				}
				
				y++;
			}
			
			x++;
		}

	}

	public void update(double xyz[]){


		//Checa se usu�rio saiu do bloco central
		if(xyz[0]==0){
			dx(xyz);//Desce em x
		}else if(xyz[1]==0){
			dy(xyz);//Desce em y
		}else if(xyz[2]==0){
			dz(xyz);//Desce em z
		}else if(xyz[0]==501){
			sx(xyz);//Sobe em x
		}else if(xyz[1]==501){
			sy(xyz);//Sobe em y
		}else if(xyz[2]==501){
			sz(xyz);//Sobe em z
		}

	}

	private void sz(double xyz[]) {//Sobe para o pr�ximo bloco em Z
		xyz[2]=1;//Atualiza a coordenada

		centralizaMatriz();

	}

	private void sy(double xyz[]) {//Sobe para o pr�ximo bloco em Y
		xyz[1]=1;//Atualiza a coordenada
		centralizaMatriz();

	}

	private void sx(double xyz[]) {//Sobe para o pr�ximo bloco em X
		xyz[0]=1;//Atualiza a coordenada
		centralizaMatriz();

	}

	private void dz(double xyz[]) {//Desce para o pr�ximo bloco em Z
		xyz[2]=500;//Atualiza a coordenada
		centralizaMatriz();

	}

	private void dy(double xyz[]) {//Desce para o pr�ximo bloco em Z
		xyz[1]=500;//Atualiza a coordenada
		centralizaMatriz();

	}

	private void dx(double xyz[]) {//Desce para o pr�ximo bloco em Z
		xyz[0]=500;//Atualiza a coordenada
		centralizaMatriz();

	}

}
