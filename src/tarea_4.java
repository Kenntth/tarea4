public class tarea_4 {

    //Atributos
public String DPI;
public String saldo;
public String interes;
public String numerodecuenta;
public String ingreso;
    public String retiro;


// get de atributos


    public String getDPI() {
        return DPI;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getInteres() {
        return interes;
    }

    // set de atributos

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    //Operaciones
    public void actualizar(){

        System.out.println("Saldo actual "+this.saldo+"Saldo actualizado= "+this.saldo+"/"+365);
}
    public void Ingresar(){
       String total;
       total=ingreso+saldo;

        System.out.println("Realizando ingreso de credito a la cuenta = "+this.ingreso+"+"+this.saldo);
    }

    public void retirar(){

        String Total;
        System.out.println("se han retirado de tu cuenta "+this.retiro);



}
    }