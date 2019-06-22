class ForExample {
    public static void main(String [] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class NestedForExample {
    public static void main(String [] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

class PyramidExample {
    public static void main(String [] args) {
        int term  = 6;
        for(int i= 1; i <= term; i++) {
            for(int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class ForEachExample {
    public static void main(String [] args) {
        int arr[] = {12, 23, 44, 56, 78};
        for(int i:arr){
            System.out.println(i);
        }
    }
}

class LabeledForExample {
    public static void main(String [] args) {
        aa:
        for(int i = 1; i <= 3; i++) {
            bb:
                for(int j = 1; j <= 3; j++) {
                    if(i == 2 && j == 2) {
                        break bb;
                    }
                    System.out.println(i + " " + j);
                }
        }
    }
}

class InfLoop {
    public static void main(String [] args) {
        for(;;) {
            System.out.println("infinitive loop");
        }
    }
}