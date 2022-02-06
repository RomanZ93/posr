public class Main {
    public static void main(String[] args) {
        int check = 200;
        int replenishment = 1500;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;


        } else {
            bonus = 0;
        }
        int result = check + replenishment + bonus;

        System.out.println(bonus);
        System.out.println(result);


    }


}
