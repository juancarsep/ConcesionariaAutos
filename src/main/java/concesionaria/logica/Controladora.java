package concesionaria.logica;

import concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {

        Automovil nuevoAuto = new Automovil();

        nuevoAuto.setModelo(modelo);
        nuevoAuto.setMarca(marca);
        nuevoAuto.setMotor(motor);
        nuevoAuto.setColor(color);
        nuevoAuto.setPatente(patente);
        nuevoAuto.setCantPuertas(cantPuertas);

        controlPersis.agregarAutomovil(nuevoAuto);

    }

    public List<Automovil> traerListaAutos() {

        return controlPersis.traerListaAutos();

    }

    public void eliminarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int id) {
        return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.modificarAuto(auto);
    }

}
