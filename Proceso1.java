public class Proceso1 extends Thread{
    int num_par = 0;

    @Override
    public void run(){
        for (int i = 0; i <= 99; i++){
            System.out.println("Numero par " + num_par);
            num_par = num_par + 2;
        }
    }
}
