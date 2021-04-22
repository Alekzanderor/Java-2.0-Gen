package GiftTreats;

public class Candy extends Treat{

    Boolean poisoned;

    public Candy(String name, String producerName, float price, float weight, String color,Boolean poisoned) {
        super(name, producerName, price, weight, color);
        this.poisoned=poisoned;
    }

    @Override
    public void showInfoLine() {
        super.showInfoLine();
        System.out.print(" Отравленный "+poisoned.toString());
    }

    @Override
    public void showInfoRow() {
        super.showInfoRow();
        System.out.println(" Отравленный "+poisoned.toString());
    }

}
