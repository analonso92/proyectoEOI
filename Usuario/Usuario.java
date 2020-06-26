package Usuario;

public class Usuario {
    private String Usuario;
    private String Password;
    private String Email;
    private int Telefono;
    private int Telefono2;
	
    public Usuario() {
		
	}
    
	public Usuario(String usuario, String password, String email, int telefono, int telefono2) {
		Usuario = usuario;
		Password = password;
		Email = email;
		Telefono = telefono;
                Telefono2 = telefono2;
                
	}

	public String getUsuario(){
		return Usuario;
	}
	
	public void setUsuario(String usuario) {
	    Usuario = usuario;
	}
	
	public String getPassword(){
		return Password;
	}
	
	public void setPassword(String password) {
	    Password = password;
	}
        
        public String getEmail(){
            return Email;
        }
        
        public void setEmail(String email){
            Email = email;
        }
        
        public int getTelefono(){
            return Telefono;
        }
        
        public void setTelefono(int telefono){
            Telefono = telefono;
        }
        
           public int getTelefono2(){
            return Telefono2;
        }
        
        public void setTelefono2(int telefono2){
            Telefono2 = telefono2;
        }
	
	public String toString() {
		return "El Usuario se llama " + Usuario 
                        + ", su contraseña es " + Password +
			", su email es " + Email + 
			" y su teléfono es " + Telefono
                        + ". Su teléfono secundario es " + Telefono2; 
        }
    
}
