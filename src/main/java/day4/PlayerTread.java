package day4;

public class PlayerTread extends Thread{
    final static int[] turnCount = new int[1];
    final static String[] ball = new String[1];

    public PlayerTread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " ready");
        while (turnCount[0] < 10) {
            synchronized (ball) {
                turn();
            }
        }
    }

    private void turn() {
        if(!getName().equals(ball[0])) {
            ball[0] = getName();

            System.out.println("turn " + turnCount[0] + getName());
            turnCount[0]++;
        }
    }

}
