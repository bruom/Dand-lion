package entities;

/*
 * Classe responsavel pelo universo.
 * 
 * Todo o gerenciamento maior, que aconteça fora das outras classes é feito aqui.
 */

public class Universo {

	//  ATRIBUTOS!
	public static Galaxia galaxia;
	public static User usuario;

	//-------------------------------------------------
	//  Métodos!
	//-------------------------------------------------

	public Universo(){//Metodo construtor!
		int quadr[] = new int[3];
		quadr[0]=100;
		quadr[1]=100;
		quadr[2]=3;
		
		double coords[] = new double[3];
		coords[0] = 225;
		coords[1] = 225;
		coords[2] = 225;
		
		Universo.galaxia = new Galaxia("\\dat\\topMap");
		Universo.usuario = new User(quadr,coords);

		//Iinstancie aqui o resto ^^

		update();

	}

	public void update(){//Update universal.
		//Universo.usuario.update();
	}


}//Universo
