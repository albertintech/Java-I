package Employee;

import java.util.ArrayList;

public class CallEmployee {
    public static void main(String[] args) {
        Employee person1;
        Salesperson person2;
        Author person3;

        ArrayList<Employee> personList = new ArrayList<Employee>();
        int i;

        person1 = new Employee();
        person1.setName("Joe");

        person2 = new Salesperson();
        person2.setName("Bill");
        person2.setProduct("computers");

        person3 = new Author();
        person3.setName("Jose");
        person3.setGenre("mysteries");

        personList.add(person3);
        personList.add(person2);
        personList.add(person1);

        for (i = 0; i < personList.size(); ++i) {
            personList.get(i).printInfo();
        }
    }
}
