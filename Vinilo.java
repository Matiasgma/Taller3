/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilos;

/**
 *
 * @author Matías
 */
public class Vinilo {
    
    private String titulo;
    private String agno;
    
    public Vinilo(String agno,String titulo){
     this.titulo = titulo;
     this.agno = agno;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAgno() {
        return agno;
    }

    public void setAgno(String agno) {
        this.agno = agno;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Titulo: "+titulo+", Año: "+agno;
    }
}
