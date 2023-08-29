public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refillAmount = 2000;
        int freeMoney = 100;
        int bonus;

        System.out.println("Начальный баланс: " + balance);

        if (refillAmount > 1000) {
            bonus = refillAmount / freeMoney;
        } else {
            bonus = 0;
        }

        balance = balance + refillAmount + bonus;

        System.out.println("Пополнение: " + refillAmount);
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый баланс: " + balance);
    }
}
