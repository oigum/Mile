public class Main {

    public static void main(String[] args) {
        int ticketPrice = (int) 50_000F;

        int bonusMile = 20;
        int numberBonus = (int) ticketPrice / bonusMile;
        System.out.println("Итоговое количество бонусов" + numberBonus);

    }}
