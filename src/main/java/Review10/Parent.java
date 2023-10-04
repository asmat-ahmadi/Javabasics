package Review10;

abstract class Parent {

        abstract void m1();
        abstract void m1(int x);
    }
    class Subclass extends Parent {
        @Override
        void m1() {
            System.out.println("m1 without parameters");
        }
        @Override
        void m1(int x) {
            System.out.println("m1 method with parameter");
        }
        

        public static void main(String[] args) {
            Subclass obj = new Subclass();
            obj.m1();
            obj.m1(1);
        }
    }

