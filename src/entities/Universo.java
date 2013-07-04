package entities;
/*
 * Classe responsavel pelo universo.
 * 
 * Todo o gerenciamento maior, que aconte�a fora das outras classes � feito aqui.
 */

public class Universo {

	//  ATRIBUTOS!
	public Galaxia galaxia;
	public User usuario;

	//-------------------------------------------------
	//  M�todos!
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
		
		this.galaxia = new Galaxia("\\dat\\topMap");
		this.usuario = new User(quadr,coords);

		//Iinstancie aqui o resto ^^

		update();

	}

	public void update(){//Update universal.
		this.usuario.update();
	}


}//Universo
