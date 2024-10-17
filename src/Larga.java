public class Larga extends Arma implements Comparable{
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

    public int compareTo(Object o) {
        if (o instanceof Larga) {
            Larga otraArma = (Larga) o;
            return Integer.compare(this.nivelArma, otraArma.nivelArma);
        }
        return 0; // Si el objeto no es de tipo Larga, no puede compararse
    }


        @Override
        public String toString() {
            return "Larga(" + "justifUso='" + justifUso + ", nivelArma=" + nivelArma + ", tieneSello=" + tieneSello +
                    ", cantMuniciones=" + CantMuniciones + ", alcance=" + alcance + ", marca='" + marca +
                    ", calibre=" + calibre + ", estado='" + estado + ')';
        }

}
