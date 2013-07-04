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
		this.galaxia = new Galaxia();
		this.usuario = new User(null);

		//Iinstancie aqui o resto ^^

		update();

	}

	public void update(){//Update universal.
		this.usuario.update();
	}


}//Universo
