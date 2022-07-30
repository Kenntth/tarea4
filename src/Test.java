public class Test {
    public static void main(String[]args){

        //creando instancias
        tarea_4 cliente1 =new tarea_4();
        cliente1.saldo="500";
        cliente1.DPI="876553770101";
        cliente1.ingreso="300";
        cliente1.retiro="250";

        tarea_4 cliente2 =new tarea_4();
        cliente2.saldo="400";
        cliente2.DPI="876553770101";
        cliente2.ingreso="300";
        cliente2.retiro="250";

        tarea_4 cliente3 =new tarea_4();
        cliente3.saldo="700";
        cliente3.DPI="876553770101";
        cliente3.ingreso="300";
        cliente3.retiro="250";

cliente1.actualizar();
cliente1.Ingresar();
cliente1.retirar();

        cliente2.actualizar();
        cliente2.Ingresar();
        cliente2.retirar();


        cliente3.actualizar();
        cliente3.Ingresar();
        cliente3.retirar();


    }






}
