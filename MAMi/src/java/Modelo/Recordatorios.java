/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian David
 */
public class Recordatorios {
    private int id;
    private int idmama;
    private String fechacita;
    private String fechaenvio;
    private String mensaje;
    private String asunto;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idMama
     */
    public int getIdMama() {
        return idmama;
    }

    /**
     * @param IdMama the idMama to set
     */
    public void setIdMama(int idmama) {
        this.idmama = idmama;
    }

    /**
     * @return the fecha
     */
    public String getFechaCita() {
        return fechacita;
    }

    /**
     * @param FechaCita the fecha to set
     */
    public void setFechaCita(String fechacita) {
        this.fechacita = fechacita;
    }
       
    /**
     * @return the FechaEnvio
     */
    public String getFechaEnvio() {
        return fechaenvio;
    }
    
    /**
     * @param FechaEnvio the fecha to set
     */
    public void setFechaEnvio(String fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the tipo
     */
    public String getAsunto() {
        return asunto;
    }
    
    /**
     * @param Asunto the mensaje to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
}
