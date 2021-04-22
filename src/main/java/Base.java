import java.io.*;
import GiftTreats.*;
import Calculator.*;


public class Base {
    public static void main(String[] args) throws IOException {


        //Задание 4
        /*
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        ArrayWithNumbers AWN=new ArrayWithNumbers();
        AWN.FindAndReplace();

        System.out.println();
        System.out.println();

        GiftBasket GiftBasket = new GiftBasket();
        GiftBasket.weight();
        GiftBasket.price();
        GiftBasket.showInfoAll();*/

        //Задание 5 000

        ConsoleCalculator CC=new ConsoleCalculator();
        CC.ReadInput();
        CC.Calc();


    }
}
