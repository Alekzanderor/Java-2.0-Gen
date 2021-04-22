package Calculator;

import java.io.*;

public class ConsoleCalculator extends BasicCalculator implements ReadingFromConsole,Calculating{

    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

    @Override
    public void ReadInput() throws IOException {

        //считываем пользовательский ввод
        System.out.println("Enter first number");
        X= Float.valueOf(br.readLine());
        System.out.println("Enter second number");
        Y= Float.valueOf(br.readLine());
        System.out.println("Choose operator");
        operator = br.readLine();

    }

    @Override
    public void Calc(){
        //проверяем операнд с помощью if else и производим операцию с введенным значениями
        if (operator.equals("+")) {System.out.printf("%.4f", X+Y) ;}
        else if (operator.equals("-")) {System.out.printf("%.4f",X-Y);}
        else if (operator.equals("*")) {System.out.printf("%.4f",X*Y);}
        else if (operator.equals("/")) {System.out.printf("%.4f",X / Y);}
        else { System.out.println("Incorrect operand" + "operand"); }

    }

}
