import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.print("Row :");
        int row = inp.nextInt();
        System.out.print("Column :");
        int column = inp.nextInt();

        MineSweeper game = new MineSweeper(row,column);

        game.run();




    }
}