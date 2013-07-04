package entities;

import reality.Realidade;

/*
 * Classe responsável por gerenciar os MegaBlocos.
 * Inicializada e utilizada pela classe User.
 * 
 * Cria, atualiza, modifica, preenche os Blocos
 * 
 * NÃO TEM METODO CONSTRUTOR!
 * 
 */

public class BlockADM {

	//  ATRIBUTOS!
	public int blocoSfera = 3;//Define quantos blocos serão carregados ao mesmo tempo (Quantos blocos cada lado da matriz terá)
	public MegaBloco matrizDeBlocos[][][];//Retem os blocos em memória
	public int blocoAtual[] = new int[3];//Bloco em que o usuário se encontra. Sendo x, y, z as posições

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public void centralizaMatriz() {//Centraliza o usuário na matriz, em relação aos blocos TODO VER!
		blocoAtual[0]=(int) ((double)(blocoSfera/2)+0.5);
		blocoAtual[1]=(int) ((double)(blocoSfera/2)+0.5);
		blocoAtual[2]=(int) ((double)(blocoSfera/2)+0.5);
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
					
					identificadorLocal++;
					z++;
				}

				y++;
			}

			x++;
		}

	}//geraBlocos
	
	public void setaCoordsMatriz(int coords[],int identBlockLocal){
		switch(identBlockLocal){
		case 1:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 2:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 3:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 4:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 5:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 6:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 7:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 8:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 9:
			coords[0]=Realidade.universo.usuario.quadrante[0]-1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 10:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 11:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 12:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 13:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 14:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 15:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 16:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 17:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 18:
			coords[0]=Realidade.universo.usuario.quadrante[0];
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 19:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 20:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 21:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]-1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 22:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 23:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 24:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1];
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		case 25:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]-1;
			break;
		case 26:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2];
			break;
		case 27:
			coords[0]=Realidade.universo.usuario.quadrante[0]+1;
			coords[1]=Realidade.universo.usuario.quadrante[1]+1;
			coords[2]=Realidade.universo.usuario.quadrante[2]+1;
			break;
		}
	}//setaCoordsMatriz


	public void update(double xyz[]){//Update


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


	private void dx(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[0]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dx

	private void dy(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[1]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dy

	private void dz(double xyz[]) {//Desce para o próximo bloco em Z
		xyz[2]=500;//Atualiza a coordenada
		centralizaMatriz();

	}//dz

	private void sx(double xyz[]) {//Sobe para o próximo bloco em X
		xyz[0]=1;//Atualiza a coordenada
		centralizaMatriz();

	}//sx

	private void sy(double xyz[]) {//Sobe para o próximo bloco em Y
		xyz[1]=1;//Atualiza a coordenada
		centralizaMatriz();

	}//sy

	private void sz(double xyz[]) {//Sobe para o próximo bloco em Z
		xyz[2]=1;//Atualiza a coordenada

		centralizaMatriz();

	}//sz




}//BlockADM
