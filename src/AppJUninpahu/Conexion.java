package AppJUninpahu;


public class Conexion {

    
    public static Conexion instancia;
       
    private Conexion () {
    }
 
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void conectar(){
        System.out.println("Conexion de Sonic Forces");
    }
    
    public void desconectar(){
        System.out.println("Desconexion de Sonic Forces");
    }
    
}
    

