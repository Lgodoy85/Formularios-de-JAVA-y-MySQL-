package heladeria;

import Vista.FrMPrincipal;
import dao.HeladeriaDao;
import dao.conexion;

public class Heladeria {

    public static void main(String[] args) {
        
        FrMPrincipal nuevoFormulario= new FrMPrincipal();
        
        nuevoFormulario.setExtendedState(nuevoFormulario.MAXIMIZED_BOTH);
 
        nuevoFormulario.setDefaultCloseOperation(nuevoFormulario.EXIT_ON_CLOSE);
        nuevoFormulario.setVisible(true);
        
        
            HeladeriaDao h = new HeladeriaDao();
            conexion c=  new conexion();
            if(c.RetornarConeccion()!=null){
                System.out.println("exito");
            }else{
                System.out.println("No anda che");
            }
        
        
        
    }
    
}
