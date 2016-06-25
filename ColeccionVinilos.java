/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilos;

import java.util.ArrayList;

/**
 *
 * @author Matías
 */
public class ColeccionVinilos {

    ArrayList<Vinilo> colecVinilo;

    public ColeccionVinilos() {

        this.colecVinilo = new ArrayList<Vinilo>();

    }

    public void agregarVinilo(String titulo, String agno) {
        colecVinilo.add(new Vinilo(titulo, agno));
    }

    public boolean buscarVinilo(String titulo) {
        boolean y = false;
        for (int i = 0; i < colecVinilo.size(); i++) {

            if (colecVinilo.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                y = true;
            }

        }
        return y;
    }

    public ArrayList<Vinilo> resultadoBusqueda(String titulo) {

        ArrayList<Vinilo> s = new ArrayList();
        for (int i = 0; i < 10; i++) {

            if (colecVinilo.get(i).getTitulo().equalsIgnoreCase(titulo)) {

                s.add(colecVinilo.get(i));
            }

        }
        return s;
    }

    public ArrayList<Vinilo> getColecVinilo() {
        return colecVinilo;
    }

    public void setColecVinilo(ArrayList<Vinilo> colecVinilo) {
        this.colecVinilo = colecVinilo;
    }

}
