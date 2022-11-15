public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        maksim.hello();
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anya.hello();
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        katya.hello();
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artem.hello();
    }
}