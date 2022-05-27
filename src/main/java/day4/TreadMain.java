package day4;

public class TreadMain {
    public static void main(String[] args){
        PlayerTread player1 = new PlayerTread("ping");
        PlayerTread player2 = new PlayerTread("pong");
        player1.start();
        player2.start();
    }
}
