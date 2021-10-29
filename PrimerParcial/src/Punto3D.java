public class Punto3D {
    //Atributos
    Double x;
    Double y;
    Double z;

    //Constructores
    public Punto3D(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public Punto3D(Double t){
        this.x = t;
        this.y = t;
        this.z = t;
    }
    public Punto3D(){
    //  this.x = 0;
    //  this.y = o;
    // this.z = 0;
    }

    //Metodos
    public Double distanciaDesdeOrigen () {
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2));
    }
    public Double distanciaDesdeOtroPunto (Double x, Double y, Double z) {
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2) + Math.pow(this.z-z,2));
    }
    public Double distanciaDesdeOtroPunto (Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2) +
                Math.pow(this.z - otroPunto.z, 2));
    }

    @Override
    public String toString() {
        return "Punto x: "+this.x+" Punto y "+this.y;
    }
}
