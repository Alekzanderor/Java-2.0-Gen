package GiftTreats;

public class Cake extends Treat{

    Boolean magical;

    public Cake(String name, String producerName, float price, float weight, String color, boolean magical) {
        super(name, producerName, price, weight, color);
        this.magical=magical;
    }

    @Override
    public void showInfoLine() {
        super.showInfoLine();
        System.out.print(" Волшебный: "+magical);
    }

    @Override
    public void showInfoRow() {
        super.showInfoRow();
        System.out.println(" Волшебный: "+magical);
    }
}
