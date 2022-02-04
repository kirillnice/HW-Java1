public class Main2 {
    public static void main(String[] args) {

        int refill = 1000;//Сумма пополнения счета
        int balance = 100;//Первоночальный баланс
        int bonus = (refill / 100);//Условия расчета бонуса

        System.out.println(("Внесены средства в размере: ") + refill);//Инфо о внесенной сумме

        if (refill >= 1000) {//Инфо о количестве начисленных бонусов
            System.out.println(("Начислен бонус в размере: ") + bonus);
        } else {
            System.out.println("Бонусов начислено: 0");
        }

        if (refill >= 1000) { //Расчет баланса
            System.out.println("ВАШ БАЛАНС: " + (refill + balance + bonus));
        } else {
            System.out.println("ВАШ БАЛАНС: " + (balance + refill));
        }


    }
}
