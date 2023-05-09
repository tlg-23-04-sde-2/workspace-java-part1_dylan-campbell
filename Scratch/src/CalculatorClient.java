/*
 *
 */
class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(3, 5);
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + calc.subtract(3, 5));

        System.out.println();
        System.out.println(calc.getRandomInt());

        System.out.println();
        System.out.println(calc.getRandomInt(5, 10)); // calls the min-max version
        System.out.println(calc.getRandomInt(0, 5)); // calls the min-max version
        System.out.println(calc.getRandomInt(5, 20)); // calls the min-max version
    }
}