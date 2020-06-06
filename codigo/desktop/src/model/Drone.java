package model;

public class Drone {

    private int id;
    private String marca;
    private String modelo;
    private String uso;
    //private int adm_id;

    public Drone(String marca, String modelo, String uso) {
        this.marca = marca;
        this.modelo = modelo;
        this.uso = uso;
    }

    public Drone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    /**
     * @return the adm_id
     */
    /*public int getAdm_id() {
        return adm_id;
}
     */
    /**
     * @param adm_id the adm_id to set
     */
    /*  public void setAdm_id(int adm_id) {
        this.adm_id = adm_id;
    }
     */
}
