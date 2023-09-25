package class20;

public class Person {

        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }

    class Employee extends Person {
        int salary;

        public Employee(String firstName, String lastName, int age, int salary) {
            super(firstName, lastName, age);
            this.salary = salary;
        }

        public void print() {
            System.out.println(firstName + " " + lastName + " " + age + " " + salary);
        }
    }

    class Tester extends Employee {
        String programmingLanguages;

        public Tester(String firstName, String lastName, int age, int salary, String programmingLanguages) {
            super(firstName, lastName, age, salary);
            this.programmingLanguages = programmingLanguages;
        }


        public void print() {
            System.out.println(firstName + " " + lastName + " " + age + " " + salary + " " + programmingLanguages);
        }
    }

    class Main {
        public static void main(String[] args) {
            Employee employee = new Employee("Joe", "Smith", 35, 35000);
            Tester tester = new Tester("Adam", "Smith", 15, 0, "java");

            employee.print();
            tester.print();
        }
    }

