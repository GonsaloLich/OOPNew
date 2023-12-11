public class Main {
    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Ivan",33,101,9000),
                new Customer("Tom",28,103,9002),
                new Customer("Sara",35,100,9003),

        };

        Gamer[] gamers = {
                new Gamer("John",26,111,"OS"),
                new Gamer("Her",36,105,"OS"),
        };

        PrintServiceForInvestor printServiceForInvestor = new PrintServiceForInvestor();
        printServiceForInvestor.print(customers);
        PrintServiceForInvestor.print(gamers);

        Person[] people = new Person[gamers.length + customers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }
        printServiceForInvestor.print(people);
    }
}