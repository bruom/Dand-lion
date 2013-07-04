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

	//=========================================================================================

	public static int blocoSfera = 3;//Define quantos blocos serão carregados ao mesmo tempo (Quantos blocos cada lado da matriz terá)
	public static MegaBloco matrizDeBlocos[][][];//Retem os blocos em memória


	//public static BlockADM blockAdm;

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public User(int quadr[],double iniXYZ[]){//Construtor

		User.quadrante=quadr;
		User.xyz=iniXYZ;//Seta a localização do usuário no bloco

		//blockAdm = new BlockADM();
		//blockAdm.geraBlocos();
		
		geraBlocos();


	}//User

	//-------------------------------------------------

	public static void centralizaMatriz() {//Centraliza o usuário na matriz, em relação aos blocos TODO VER!
		localBlock[0]=(int) ((double)(blocoSfera/2)+0.5);
		localBlock[1]=(int) ((double)(blocoSfera/2)+0.5);
		localBlock[2]=(int) ((double)(blocoSfera/2)+0.5);
	}//centralizaMatriz


	public void geraBlocos() {//Percore a matriz gerando e preenchendo cada bloco
		matrizDeBlocos = new MegaBloco[blocoSfera][blocoSfera][blocoSfera];//Instancia a matriz de blocos

		int x=0,y=0,z=0,identificadorLocal=1;//Variaveis de percursão

		for(x=0;x<matrizDeBlocos.length;){
			for(y=0;y<matrizDeBlocos[0].length;){
				for(z=0;z<matrizDeBlocos[0][0].length;){

					int coordBloco[] = new int[3];

					setaCoordsMatriz(coordBloco,identificadorLocal);

					matrizDeBlocos[x][y][z].setup(coordBloco, identificadorLocal);

					matrizDeBlocos[x][y][z].gerarEstrelas();

					identificadorLocal++;
					z++;
				}

				y++;
			}

			x++;
		}

	}//geraBlocos
	
	public static void setaCoordsMatriz(int coords[],int identBlockLocal){
		switch(identBlockLocal){
		case 1:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]-1;
			break;
		case 2:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2];
			break;
		case 3:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]+1;
			break;
		case 4:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]-1;
			break;
		case 5:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2];
			break;
		case 6:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]+1;
			break;
		case 7:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]-1;
			break;
		case 8:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2];
			break;
		case 9:
			coords[0]=quadrante[0]-1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]+1;
			break;
		case 10:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]-1;
			break;
		case 11:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2];
			break;
		case 12:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]+1;
			break;
		case 13:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]-1;
			break;
		case 14:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1];
			coords[2]=quadrante[2];
			break;
		case 15:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]+1;
			break;
		case 16:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]-1;
			break;
		case 17:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2];
			break;
		case 18:
			coords[0]=quadrante[0];
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]+1;
			break;
		case 19:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]-1;
			break;
		case 20:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2];
			break;
		case 21:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]-1;
			coords[2]=quadrante[2]+1;
			break;
		case 22:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]-1;
			break;
		case 23:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2];
			break;
		case 24:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1];
			coords[2]=quadrante[2]+1;
			break;
		case 25:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]-1;
			break;
		case 26:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2];
			break;
		case 27:
			coords[0]=quadrante[0]+1;
			coords[1]=quadrante[1]+1;
			coords[2]=quadrante[2]+1;
			break;
		}
	}//setaCoordsMatriz

	public static void update(double xyz[]){//Update


		//Checa se usuário saiu do bloco central
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

	}//update

	
	private static void dx(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[0]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dx

	private static void dy(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[1]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dy

	private static void dz(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[2]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dz

	private static void sx(double xyz[]) {//Sobe para o próximo bloco em X
		xyz[0]=1;//Atualiza a coordenada
		centralizaMatriz();

	}//sx

	private static void sy(double xyz[]) {//Sobe para o próximo bloco em Y
		xyz[1]=1;//Atualiza a coordenada
		centralizaMatriz();

	}//sy

	private static void sz(double xyz[]) {//Sobe para o próximo bloco em Z
		xyz[2]=1;//Atualiza a coordenada

		centralizaMatriz();

	}//sz



}//User