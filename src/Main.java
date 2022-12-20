public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        maksim.hello();
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anya.hello();
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        katya.hello();
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artem.hello();
        Human vladimir = new Human(2001, "Владимир", "Казань", "");
        vladimir.hello();

        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower peony = new Flower(null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);
        printInfo(rose);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);
        printCoastOfBouquet(
                rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        );
    }

    private static void printInfo(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                        ", страна: " + flower.getCountry() +
                        ", стоимость за штуку: " + flower.getCost() +
                        ", срок стояния цветка: " + flower.lifeSpan
        );
    }

    private static void printCoastOfBouquet(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minLifeSpan);
    }
}