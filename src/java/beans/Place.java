/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Imane
 */
public class Place {
  private int id;
  private int numero;
  private Boolean etat;
  private String type;
  private int ref;

    public Place(int id, int numero, Boolean etat, String type, int ref) {
        this.id = id;
        this.numero = numero;
        this.etat = etat;
        this.type = type;
        this.ref = ref;
    }

    public Place(int numero, Boolean etat, String type, int ref) {
        this.numero = numero;
        this.etat = etat;
        this.type = type;
        this.ref = ref;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
      this.ref = ref;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", numero=" + numero + ", etat=" + etat + ", type=" + type + ", section=" + ref + '}';
    }
  

  
}
