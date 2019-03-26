package OOP;

public class MultiThread implements Runnable {

    int[] a1;
    int[] a2;

    int[] result = new int[5];

    String name;

    MultiThread(int[] a1, int[] a2, String name) {
        this.a1 = a1;
        this.a2 = a2;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            result[i] = a1[i] + a2[i];

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
