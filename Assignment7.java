package Assignments;
// Thread for Even Numbers
class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

// Thread for Odd Numbers
class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}



public class Assignment7 {
	// Main Class

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        // Start Threads
        t1.start();
        t2.start();
    }
}
