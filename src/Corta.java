public class Corta extends Arma{
   private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantMuniciones,alcance,marca,calibre,estado);
        this.esAutomatica = esAutomatica;
    }

    @Override
    public boolean enCondicion() {
        // La condición para que el arma esté en uso y el calibre sea >= 9
        return this.estado.equals("EN USO") && this.calibre >= 9;
    }

    public boolean efectividadMas200m() {
        return this.alcance > 200;
    }
}
