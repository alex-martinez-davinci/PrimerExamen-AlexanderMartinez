public class Vector3D {
    //Atributos
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    //Constructores
    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal){
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }
    public Vector3D(Punto3D puntoFinal){
        this.puntoFinal = new Punto3D();

    }
    //Metodos
    public double magnitudVector(){

        return Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2) + Math.pow(puntoFinal.y-puntoInicial.y,2)
                + Math.pow(puntoFinal.z-puntoInicial.z,2));

    }
    public void mostrarComponentes(){
            System.out.println(puntoInicial.x-puntoFinal.x);
            System.out.println(puntoInicial.y- puntoFinal.y);
            System.out.println(puntoInicial.z- puntoFinal.z);
    }
}
