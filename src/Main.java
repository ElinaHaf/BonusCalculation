public class Main {
    public static void main(String[] args) {

        int price = 80;            // стоимость билета
        int bonusForTicket = 20;     // количество рублей для одной бонусной милли


        System.out.println("Благодарим за использование нашего сервиса! Вам начислено:");
        System.out.println((price / bonusForTicket) + " бонусные(ая) мили(я)");
    }
}