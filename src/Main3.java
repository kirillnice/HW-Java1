public class Main3 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("КОЛИЧЕСТВО БОНУСНЫХ МИЛЬ НАЧИСЛЕНО: " + miles);
    }
}