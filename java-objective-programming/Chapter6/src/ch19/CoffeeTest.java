package ch19;

public class CoffeeTest {
    public static void main(String[] args) {

        System.out.println("Make Americano");
        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println("\nMake Latte");
        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println("\nMake Mocha Coffee");
        Coffee ethiopiaMocha = new Mocha(new Latte(new EthiopiaAmericano()));
        ethiopiaMocha.brewing();

        System.out.println("\nMake Mocha Coffee with whip");
        Coffee kenyaMochaWithWhip = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
        kenyaMochaWithWhip.brewing();
    }
}
