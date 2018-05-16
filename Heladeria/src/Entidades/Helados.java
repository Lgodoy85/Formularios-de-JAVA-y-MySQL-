package Entidades;

import dao.HeladeriaDao;
import java.util.ArrayList;

public class Helados {
    
private int idHelado;
private String sabor;

    public Helados(int idHelado, String sabor) {
        this.idHelado = idHelado;
        this.sabor = sabor;
    }
    
  public static ArrayList<String> retornarheladeria(){
        HeladeriaDao playerDao= new HeladeriaDao();
        return playerDao.retornarHeladeria();    
    }
    
}
   
