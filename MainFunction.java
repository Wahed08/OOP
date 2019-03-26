package OOP;

public class MainFunction {
    
        public static void main(String[] args) {
        int[] a0 = new int[]{1, 3, 34, 4, 9};
        int[] a1 = new int[]{2,20,11,3,6};
        int[] a2 = new int[]{6,1,43,56,23};
        int[] a3 = new int[]{98,39,20,4,91};

        MultiThread firststr = new MultiThread(a0, a1, "FirstString");
        MultiThread secondstr = new MultiThread(a2, a3, "SecondString");

        Thread Thread1 = new Thread(firststr);
        Thread Thread2 = new Thread(secondstr);

        Thread1.start();
        Thread2.start();

        while (Thread1.isAlive() || Thread2.isAlive());

        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(firststr.result[i]+secondstr.result[i]);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
    }
}
