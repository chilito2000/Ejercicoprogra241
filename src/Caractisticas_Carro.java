public class Caractisticas_Carro extends Main {

    public void activarAireAcondicionado() {
        System.out.println("El aire acondicionado del coche está activado.");
    }

    public void desactivarAireAcondicionado() {
        System.out.println("El aire acondicionado del coche está desactivado.");
    }

    public static void main(String[] args) {
        Caractisticas_Carro miCarro = new Caractisticas_Carro();


        miCarro.arrancar();
        miCarro.detener();
        miCarro.acelerar();
        miCarro.frenar();
        miCarro.tocarBocina();
        miCarro.encenderLuces();
        miCarro.apagarLuces();
        miCarro.abrirPuertas();
        miCarro.cerrarPuertas();
        miCarro.llenarTanque();

        
        miCarro.activarAireAcondicionado();
        miCarro.desactivarAireAcondicionado();
    }
}
