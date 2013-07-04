package entities;
/*
 * Classe responsavel pelo universo.
 * 
 * Todo o gerenciamento maior, que aconteça fora das outras classes é feito aqui.
 */

public class Universo {

	//  ATRIBUTOS!
	public Galaxia galaxia;
	public User usuario;

	//-------------------------------------------------
	//  Métodos!
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
