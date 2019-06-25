class IfStatement {
    public static void main(String [] args){
        int age = 20;
        if(age > 18) {
            System.out.println("Age is grater than 18");
        }
    }
}

class IfElseStatement {
    public static void main(String[] args) {
        int number = 13;
        if(number % 2 == 0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}

class LeapYearExample {
    public static void main(String[] args) {
        int year = 2016;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        }
        else {
            System.out.println("COMMON YEAR");
        }
    }
}

class IfElseTernary {
    public static void  main(String[] args) {
        int number = 13;
        String output = (number % 2 == 0) ? "even number":"odd number";
        System.out.println(output);
    }
}

class LadderStatement {
    public static void main(String[] args) {
        int marks = 65;
        if(marks < 50) {
            System.out.println("fail");
        }
        else if(marks >= 50 && marks < 60) {
            System.out.println("D grade");
        }
        else if(marks >= 60 && marks < 70) {
            System.out.println("C grade");
        }
        else if(marks >= 70 && marks < 80) {
            System.out.println("B grade");
        }
        else if(marks >= 80 && marks < 90) {
            System.out.println("B grade");
        }
        else if(marks >= 90 && marks < 100) {
            System.out.println("A grade");
        }
    }
}

class PosNegExample {
    public static void main(String [] args) {
        int number = -13;
        if(number > 0) {
            System.out.println("POSITIVE");
        }
        else if(number < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("ZERO");
        }
    }
}

class JavaNestedIfExample {
    public static void main(String [] args) {
        int age = 25;
        int weight = 75;
        if(age >= 18) {
            if(weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}

class JavaNestedIfExample1 {
    public static void main(String [] args) {
        int age = 17;
        int weight = 75;
        if(age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        }
        else {
            System.out.println("Age must be greater than 18");
            }
        }
    }


