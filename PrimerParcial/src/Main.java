import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Punto3D primerPunto = new Punto3D(4,3,6);
        Punto3D segundoPunto = new Punto3D(6,3,4);
        Punto3D tercerPunto = new Punto3D(3);

        System.out.println("Primer punto: " + primerPunto);
        System.out.println("Segundo punto: " + segundoPunto);
        System.out.println("Tercer punto: " + tercerPunto);

        segundoPunto.distanciaDesdeOrigen();
        segundoPunto.distanciaDesdeOtroPunto(0,0,0);
        segundoPunto.distanciaDesdeOtroPunto(primerPunto);

        Vector3D primerVector = new Vector3D(primerPunto,segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println(primerVector + "," + segundoVector);
        System.out.println("Magnitud primer Vector: " + primerVector.magnitudVector() + ", " + "Magnitud segundo Vector: " +segundoVector.magnitudVector());

        primerVector.mostrarComponentes();
        segundoVector.mostrarComponentes();


    }
}
