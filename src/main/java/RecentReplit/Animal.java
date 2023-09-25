package RecentReplit;

public class Animal {
        String type;

        public Animal(String type) {
            this.type = type;
        }

        void eat() {
            System.out.println(type + " eats");
        }

        void sleep() {
            System.out.println(type + " sleeps a lot");
        }
    }

    class Cat extends Animal {
        public Cat() {
            super("Cat");
        }

        @Override
        void sleep() {
            System.out.println(type + " sleeps a lot");
        }
    }

    class Kitten1 extends Cat {
        public Kitten1() {
            super();
            this.type = "Kitten1";
        }

        @Override
        void eat() {
            System.out.println(type + " eats milk");
        }
    }

    class Kitten2 extends Cat {
        public Kitten2() {
            super();
            this.type = "Kitten2";
        }

        @Override
        void eat() {
            System.out.println(type + " eats snacks");
        }
    }

    class Kitten3 extends Cat {
        public Kitten3() {
            super();
            this.type = "Kitten3";
        }

        @Override
        void eat() {
            System.out.println(type + " eats everything");
        }
    }

    class tester {
        public static void main(String[] args) {
            Animal[] animals = new Animal[4];
            animals[0] = new Cat();
            animals[1] = new Kitten1();
            animals[2] = new Kitten2();
            animals[3] = new Kitten3();

            for (Animal animal : animals) {
                animal.eat();
                animal.sleep();
            }
        }
    }

