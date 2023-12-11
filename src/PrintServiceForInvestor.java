public class PrintServiceForInvestor {

    public void print(Person[] people) {
        System.out.println("Размер списка покупателей " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя " + person.getName()
                    + "; возраст " + person.getAge()
                    + "; телефон " + person.getPhoneNumber());
        }
        System.out.println();
    }

    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя " + customer.getName()
                    + "; возраст " + customer.getAge()
                    + "; телефон " + customer.getPhoneNumber());
        }
        System.out.println();
    }

    public static void print(Gamer[] gamers) {
        System.out.println("Размер списка покупателей " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Имя " + gamer.getName()
                    + "; возраст " + gamer.getAge()
                    + "; телефон " + gamer.getPhoneNumber());
        }
        System.out.println();
    }
}
