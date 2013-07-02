package entities;
//Classe que rege o usu�rio

public class User {
	public int blocoSfera = 3;//Define quantos blocos ser�o carregados ao mesmo tempo (Quantos blocos cada lado da matriz ter�)
	public MegaBloco matrizDeBlocos[][][];//Retem os blocos em mem�ria
	public int blocoAtual[] = new int[3];//Sendo x, y, z as posi��es
	public double xyz[] = new double[3];//de 0,0,0 a 501,501,501
	
	public User(double[] loc){//Construtor
		this.xyz=loc;//Seta a localiza��o do usu�rio
		centralizaMatriz();
		geraBlocos();
		
		
	}//--
	
	private void centralizaMatriz() {
		this.blocoAtual[0]=(int) ((double)(blocoSfera/2)+0.5);
		this.blocoAtual[1]=(int) ((double)(blocoSfera/2)+0.5);
		this.blocoAtual[2]=(int) ((double)(blocoSfera/2)+0.5);
	}

	private void geraBlocos() {//Instancia a matriz de blocos
		matrizDeBlocos = new MegaBloco[blocoSfera][blocoSfera][blocoSfera];
		int x=0,y=0,z=0;
		for(;x<matrizDeBlocos.length;x++){
			for(;y<matrizDeBlocos[0].length;y++){
				for(;z<matrizDeBlocos[0][0].length;z++){
					
				}
			}
		}
		
	}
	

	public void update(){
		
		
		//Checa se usu�rio saiu do bloco central
		if(xyz[0]==0){
			dx();//Desce em x
		}else if(xyz[1]==0){
			dy();//Desce em y
		}else if(xyz[2]==0){
			dz();//Desce em z
		}else if(xyz[0]==501){
			sx();//Sobe em x
		}else if(xyz[1]==501){
			sy();//Sobe em y
		}else if(xyz[2]==501){
			sz();//Sobe em z
		}
		
	}

	private void sz() {//Sobe para o pr�ximo bloco em Z
		xyz[2]=1;//Atualiza a coordenada
		
		centralizaMatriz();
		
	}

	private void sy() {//Sobe para o pr�ximo bloco em Y
		xyz[1]=1;//Atualiza a coordenada
		centralizaMatriz();
		
	}

	private void sx() {//Sobe para o pr�ximo bloco em X
		xyz[0]=1;//Atualiza a coordenada
		centralizaMatriz();
		
	}

	private void dz() {//Desce para o pr�ximo bloco em Z
		xyz[2]=500;//Atualiza a coordenada
		centralizaMatriz();
		
	}

	private void dy() {//Desce para o pr�ximo bloco em Z
		xyz[1]=500;//Atualiza a coordenada
		centralizaMatriz();
		
	}

	private void dx() {//Desce para o pr�ximo bloco em Z
		xyz[0]=500;//Atualiza a coordenada
		centralizaMatriz();
		
	}
	
}