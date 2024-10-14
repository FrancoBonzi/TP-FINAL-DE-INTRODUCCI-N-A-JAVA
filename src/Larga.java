public class Larga extends Arma implements Comparable<Larga>{
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int CantMuniciones,double alcance,String marca,int calibre,String estado,String justifUso,int nivelArma,boolean tieneSello){
        super(CantMuniciones,alcance,marca,calibre,estado);
        this.justifUso=justifUso;
        this.nivelArma=nivelArma;
        this.tieneSello=tieneSello;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    @Override
    public boolean enCondicion() {
        return this.calibre >= 9 && "EN USO".equals(this.estado) && this.tieneSello;
    }

    @Override
    public int compareTo(Larga aux){
      return Integer.compare(this.nivelArma, aux.getNivelArma());
    }


        @Override
        public String toString() {
            return "Larga(" + "justifUso='" + justifUso + ", nivelArma=" + nivelArma + ", tieneSello=" + tieneSello +
                    ", cantMuniciones=" + CantMuniciones + ", alcance=" + alcance + ", marca='" + marca +
                    ", calibre=" + calibre + ", estado='" + estado + ')';
        }

}
