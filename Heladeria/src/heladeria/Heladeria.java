package heladeria;

import Vista.FrMPrincipal;

public class Heladeria {

    public static void main(String[] args) {
        
        FrMPrincipal nuevoFormulario= new FrMPrincipal();
        
        nuevoFormulario.setExtendedState(nuevoFormulario.MAXIMIZED_BOTH);
 
        nuevoFormulario.setDefaultCloseOperation(nuevoFormulario.EXIT_ON_CLOSE);
        nuevoFormulario.setVisible(true);
        
    }
    
}
