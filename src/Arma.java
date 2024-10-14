public abstract class Arma {
    protected int CantMuniciones;
    protected double alcance;
    protected String marca;
    protected int calibre;
    protected String estado;

    public Arma(int CantMuniciones,double alcance,String marca,int calibre,String estado){
        this.CantMuniciones=CantMuniciones;
        this.alcance=alcance;
        this.marca=marca;
        this.calibre=calibre;
        this.estado=estado;
    }

    public abstract boolean enCondicion();

    ///Getters y Setters
    public int getCantMuniciones() {
        return CantMuniciones;
    }

    public void setCantMuniciones(int cantMuniciones) {
        CantMuniciones = cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
