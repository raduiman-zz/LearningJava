class BreakExample {
    public  static void main(String [] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

class BreakExample2 {
    public static void main(String [] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

class BreakExample3 {
    public static void main(String [] args) {
        aa:
        for(int i = 1; i <= 3; i++) {
            bb:
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

class BreakWhileExample {
    public static void main(String [] args) {
        int i = 1;
        while(i <= 10) {
            if( i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

class BreakDoWhileExample {
    public static void main(String [] args) {
        int i = 1;
        do {
            if(i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }while(i <= 10);
    }
}