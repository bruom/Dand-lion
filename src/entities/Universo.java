package entities;
//Classe respons�vel por criar o universo!
public class Universo {
	
	public static User usuario;
	
	public Universo(){
		Universo.usuario = new User(null);
		
		//Iinstancie aqui o resto ^^
		
		update();
		
	}
	
	public void update(){
		Universo.usuario.update();
	}

}
