package AplicacionFederacionVoleibol;

import java.util.ArrayList;
import java.util.List;

public class ArrayClasificacion {
	int id;
    String nombre;
    int pj;
    int pg;
    int pp;
    int setff;
    int setfc;
    int pts;

    // Constructor para inicializar los atributos
    public ArrayClasificacion(int id, String nombre, int pj, int pg, int pp, int setff, int setfc, int pts) {
        this.id = id;
        this.nombre = nombre;
        this.pj = pj;
        this.pg = pg;
        this.pp = pp;
        this.setff = setff;
        this.setfc = setfc;
        this.pts = pts;
    }
    
    
    private List<ArrayClasificacion> equipos;

    public ArrayClasificacion() {
        equipos = new ArrayList<>();

        // Añadir equipos a la lista
        equipos.add(new ArrayClasificacion(1, "CD Avila Voleibol", 0, 0, 0, 0, 0, 0));
        equipos.add(new ArrayClasificacion(2, "CD Zaragoza", 0, 0, 0, 0, 0, 0));
        equipos.add(new ArrayClasificacion(3, "CV Alcobendas", 0, 0, 0, 0, 0, 0));
        equipos.add(new ArrayClasificacion(4, "CV Barça", 0, 0, 0, 0, 0, 0));
        equipos.add(new ArrayClasificacion(5, "CV Madrid Chamberi", 0, 0, 0, 0, 0, 0));
        equipos.add(new ArrayClasificacion(6, "CV Sayre Mayser", 0, 0, 0, 0, 0, 0));
    }

    // Método para obtener la lista de equipos
    public List<ArrayClasificacion> getEquipos() {
        return equipos;
    }

    // Getters para acceder a los atributos
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getPj() { return pj; }
    public int getPg() { return pg; }
    public int getPp() { return pp; }
    public int getSetff() { return setff; }
    public int getSetfc() { return setfc; }
    public int getPts() { return pts; }
    
    // Setters para modificar los atributos
    public void setPj(int pj) { this.pj = pj; }
    public void setPg(int pg) { this.pg = pg; }
    public void setPp(int pp) { this.pp = pp; }
    public void setSetff(int setff) { this.setff = setff; }
    public void setSetfc(int setfc) { this.setfc = setfc; }
    public void setPts(int pts) { this.pts = pts; }
}
