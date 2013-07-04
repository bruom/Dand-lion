package entities;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 * Classe responsavel por alocar os MegaBlocos.
 * 
 * Ela guarda todas as informações dos blocos, coordenadas dos sistemas,
 * seeds dos mesmos etc.
 * 
 * É usada pela BlockADM.
 *
 */

public class MegaBloco {

	//  ATRIBUTOS!
	public int seed;//Seed do bloco
	public int id;//ID global do bloco
	public final int aresta = 500;//Define a aresta do Bloco
	public int coord[] = new int[3];//Define as coordenadas do bloco na galáxia
	public int coordLocal[] = new int[3];//Define a coordenada do bloco na matriz, DIMANICO!!
	public int idLocal;//Determina o id do bloco na matriz atual, DINAMICO!!
	public int numeroDeEstrelas;//Número de estrelas no bloco
	public SistemaEstelar estrelas[];//Estrelas de cada bloco.

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public MegaBloco(){//Método construtor!



	}//MegaBloco

	public void setup(int paramCoord[],int paramIDloc){
		
		this.idLocal=paramIDloc;//Seta o id local do bloco
		this.coord=paramCoord;//seta a coordenada do bloco na galáxia

		this.numeroDeEstrelas = getNumeroDeEstrelas();//Seta o número de estrelas do bloco

		this.seed=(int)((2*this.coord[0])+(3*this.coord[1])+(4*this.coord[2]));//Seta a seed para o bloco
		this.id=Integer.parseInt(this.coord[0]+""+this.coord[1]+""+this.coord[2]);//Seta a ID global do bloco
	}//setup

	//-------------------------------------------------

	public void gerarEstrelas() {//Gera as estrelas do bloco
		Seeder semeador = new Seeder(this.seed);//Cria um seeder para o bloco

		this.estrelas = new SistemaEstelar[this.numeroDeEstrelas];//cria vetor de estrelas

		for(int i=0;i<estrelas.length;i++){//loop de criação de estrelas

			int tempCoord[]=new int[3];//vetor temporário, usado para passar as coordenadas para a estrela criada

			for(int t=0;t<3;t++){//loop secundário, gerador das 3 coordenadas
				tempCoord[t]=semeador.semearEstrelas();
			}

			estrelas[i].sysCoord=tempCoord;//Atribuição de coordenadas
			estrelas[i].id=Integer.parseInt(i+""+this.id);//Atribuição de IDs
		}

	}//gerarEstrelas


	public int getNumeroDeEstrelas(){//Retorna o número de estrelas para aquele bloco
		//z é a altura do usuário no plano.
		int x,y,z,estrelas=0;
		double p=0;

		try {//le o mapa
			Galaxia.mainMap = ImageIO.read(new File(Galaxia.mainMapName+".jpg"));
		} catch (IOException e) {
		}

		x=this.coord[0];
		y=this.coord[1];
		z=this.coord[2];


		switch(z){//checa a coord z.
		case 0: p=0.05;
		break;
		case 1: p=0.3;
		break;
		case 2: p=0.75;
		break;
		case 3: p=1;
		break;
		case 4: p=0.75;
		break;
		case 5: p=0.3;
		break;
		case 6: p=0.05;
		break;
		}

		estrelas = (int) ((p)*((0.004/8947848)*500*500*500*Math.abs(Galaxia.mainMap.getRGB(x,y))));

		return estrelas;

	}//getNumeroDeEstrelas



}//MegaBloco
