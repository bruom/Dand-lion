package entities;
//Classe que rege o usu�rio

public class User {
	public int blocoSfera = 3;//Define quantos blocos ser�o carregados ao mesmo tempo (Quantos blocos cada lado da matriz ter�)
	public MegaBloco matrizDeBlocos[][][];//Retem os blocos em mem�ria
	public int blocoAtual[] = new int[3];//Sendo x, y, z as posi��es
	public double xyz[] = new double[3];//de 0,0,0 a 501,501,501
	
	public User(double[] loc){//Construtor
		this.xyz=loc;//Seta a localiza��o do usu�rio
		geraBlocos();
		
	}//--
	
	private void geraBlocos() {//Instancia a matriz de blocos
		matrizDeBlocos = new MegaBloco[blocoSfera][blocoSfera][blocoSfera];
		
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
		
		
	}

	private void sy() {//Sobe para o pr�ximo bloco em Y
		
		
	}

	private void sx() {//Sobe para o pr�ximo bloco em X
		
		
	}

	private void dz() {//Desce para o pr�ximo bloco em Z
		
		
	}

	private void dy() {//Desce para o pr�ximo bloco em Z
		
		
	}

	private void dx() {//Desce para o pr�ximo bloco em Z
		
		
	}
	
}