//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Policia poli1=new Policia("Juan","Perez",1001);
        Policia poli2=new Policia("Pablo","Gonzalez",1002);

        Larga armasLargas1=new Larga(10,200,"Escopeta",75,"EN USO","Personal",4,true);
        Larga armasLargas2=new Larga(7,800,"AK-47",7,"EN USO","USO MILITAR",5,true);

        Corta armasCorta1=new Corta(20,180,"Glock",8,"EN MANTENIMIENTO",true);
        Corta armasCorta2=new Corta(10,300,"Bersa",9,"EN USO",false);

        ///Verificar si las armas en cuestión se encuentran en condiciones (estado "EN USO" y ser calibre >=9)
        System.out.println("¿El arma corta 1 está en condiciones?"+armasCorta1.enCondicion());
        System.out.println("¿El arma corta 2 está en condiciones?"+armasCorta2.enCondicion());
        System.out.println("¿Arma larga 1 está en condiciones? " + armasLargas1.enCondicion());
        System.out.println("¿Arma larga 2 está en condiciones? " + armasLargas2.enCondicion());

        ///Comporación de las armas largas
        if (armasLargas1.compareTo(armasLargas2) > 0) {
            System.out.println("El arma larga 1 tiene un nivel superior al arma larga 2.");
        } else if (armasLargas1.compareTo(armasLargas2) < 0) {
            System.out.println("El arma larga 2 tiene un nivel superior al arma larga 1.");
        } else {
            System.out.println("Ambas armas largas tienen el mismo nivel");
        }

        ///Verificar si las armas en cuestión puede disparar mas de 200 metros
        System.out.println("¿El arma corta 1 se puede disparar a más de 200 metros?"+armasCorta1.efectividadMas200m());
        System.out.println("¿El arma corta 2 se puede disparar a más de 200 metros?"+armasCorta2.efectividadMas200m());


    }
}