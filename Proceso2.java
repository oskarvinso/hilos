public class Proceso2 implements Runnable {
    int num_impar = 1;

    @Override
    public void run() {
        for (int i = 0; i <= 99; i++) {
          System.out.println("Numero impar " + num_impar );
          num_impar = num_impar + 2;
        }
    }
}
