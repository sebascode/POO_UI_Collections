package cl.duoc.casometro.Service;

import java.util.List;
import java.util.ArrayList;

import cl.duoc.casometro.DTO.Estacion;

public class EstacionApp {
    List<Estacion> lista = new ArrayList<>();
    
    public void Guardar(Estacion obj){
        lista.add(obj);
    }
    
    public List<Estacion> Listar(){
        return lista;
    }
    
    public Estacion Buscar(int id){
        for(Estacion e : lista){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
}
