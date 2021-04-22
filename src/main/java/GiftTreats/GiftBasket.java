package GiftTreats;
import java.util.ArrayList;

public class GiftBasket {

    float weight;
    float price;
    ArrayList <Treat> GiftBasket = new ArrayList<Treat>();
    public  GiftBasket()
    {
            GiftBasket.add(new Candy("Батончик", "РотФронт", 155, 0.05f,"Бурый", false));
            GiftBasket.add(new Candy("Подделка", "Найк", 1155, 10.05f,"Зеленый", true));
            GiftBasket.add(new Cake("Тортик", "Вкусняхи", 355, 0.75f,"Бурый-Белый-Крансый", false));
            GiftBasket.add(new Cake("ТортИзМясаДракона", "Друид&Стонхэндж", 10055, 3.05f,"Неопределенный", true));
            GiftBasket.add(new Chocolate("Черная шоколадка", "ЧШоколад", 111, 0.25f,"Черный", false));
            GiftBasket.add(new Chocolate("Белая шоколадка", "БШоколад", 133, 0.15f,"Белый", true));
    }

    public void weight()
    {
        for (Treat t: GiftBasket
             ) {
            weight+=t.weight;
        }
        System.out.println(weight +" кг");
    }
    public  void price()
    {
        for (Treat t: GiftBasket
             ) {
            price+=t.price;
        }
        System.out.println(price+" рублей");
    }
    public void showInfoAll()
    {
        for (Treat t: GiftBasket
             ) {
            t.showInfoLine();
            System.out.println();
        }
    }
}
