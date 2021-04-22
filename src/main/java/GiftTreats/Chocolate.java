package GiftTreats;

public class Chocolate extends Treat{

    boolean sparky;
    public Chocolate(String name, String producerName, float price, float weight, String color,boolean sparky) {
        super(name, producerName, price, weight, color);
        this.sparky=sparky;
    }

    @Override
    public void showInfoLine() {
        super.showInfoLine();
        System.out.print(" Шипучий: "+sparky);
    }

    @Override
    public void showInfoRow() {
        super.showInfoRow();
        System.out.println(" Шипучий: "+sparky);
    }
}
