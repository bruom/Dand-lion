package entities;
//Classe responsável por criar o universo!
public class Universo {
	
	public Galaxia galaxia;
	public User usuario;
	
	public Universo(){
		this.galaxia = new Galaxia();
		this.usuario = new User(null);
		
		//Iinstancie aqui o resto ^^
		
		update();
		
	}
	
	public void update(){
		this.usuario.update();
	}

}
