public class Main extends Thread {

// Se extiende la clase Thread




    /* En el método run, que ejecutará cada uno de los hilos. Se crea un while donde se mostrará un sout que
       mostrará el nombre del hilo y se pausará un determinando de tiempo aleatorio.
    */

    @Override
    public void run() {

        int numAleatorio=(int) (Math.random()*10);


        while (true){

            System.out.println("Soy el bucle " + this.getName()+  " y estoy trabajando");

            try {
                    Thread.sleep(numAleatorio* 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {

// Se crean objetos de la clase Main que llamarán a los hilos
        Main hilo1 = new Main();
        Main hilo2 = new Main();
        Main hilo3 = new Main();
        Main hilo4 = new Main();
        Main hilo5 = new Main();

        // Se pone un nombre a cada hilo
        hilo1.setName("hilo1");
        hilo2.setName("hilo2");
        hilo3.setName("hilo3");
        hilo4.setName("hilo4");
        hilo5.setName("hilo5");


        // Se inician los hilos

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

    }
}