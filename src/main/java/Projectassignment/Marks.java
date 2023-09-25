package Projectassignment;

    abstract class Marks {
        // Abstract method to get the percentage
        public abstract double getPercentage();
    }

    class A extends Marks {
        private double subject1;
        private double subject2;
        private double subject3;

        // Constructor for student A
        public A(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        // Implementation of abstract method for student A
        @Override
        public double getPercentage() {
            double totalMarks = subject1 + subject2 + subject3;
            return (totalMarks / 3); // Calculate average percentage
        }
    }

    class B extends Marks {
        private double subject1;
        private double subject2;
        private double subject3;
        private double subject4;

        // Constructor for student B
        public B(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

        // Implementation of abstract method for student B
        @Override
        public double getPercentage() {
            double totalMarks = subject1 + subject2 + subject3 + subject4;
            return (totalMarks / 4); // Calculate average percentage
        }
    }

     class tester1 {
        public static void main(String[] args) {
            A studentA = new A(90.5, 85.0, 78.5);
            B studentB = new B(78.0, 92.5, 87.5, 88.0);

            // Calculate and display the average percentage for student A
            System.out.println("Average Percentage for Student A: " + studentA.getPercentage() + "%");

            // Calculate and display the average percentage for student B
            System.out.println("Average Percentage for Student B: " + studentB.getPercentage() + "%");
        }
    }

