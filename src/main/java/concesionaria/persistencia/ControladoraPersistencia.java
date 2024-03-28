package concesionaria.persistencia;

import concesionaria.logica.Automovil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil nuevoAuto) {
        autoJpa.create(nuevoAuto);
    }

    public List<Automovil> traerListaAutos() {

        return autoJpa.findAutoEntities();

    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.remove(idAuto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
        return autoJpa.findAuto(id);

    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
