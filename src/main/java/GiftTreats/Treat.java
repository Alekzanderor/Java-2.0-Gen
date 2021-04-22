package GiftTreats;

public class Treat {

    String name;
    String producerName;
    float price;
    float weight;
    String color;

    public Treat (String name,String producerName,float price,float weight,String color)
    {
        this.name=name;
        this.producerName=producerName;
        this.price=price;
        this. weight=weight;
        this.color=color;
    }

    public void showInfoLine()
    {
        System.out.print("Название: "+name+" Название изготовителя: "+producerName+" Цена: "+price+" рублей"+" Масса: "+weight+" кг"+" Цвет: "+color);
    }
    public void showInfoRow()
    {
        System.out.println("Название: "+name);
        System.out.println("Название изготовителя: "+producerName);
        System.out.println("Цена: "+price+" рублей");
        System.out.println("Масса: "+weight+" кг");
        System.out.println("Цвет: "+color);
    }
}
