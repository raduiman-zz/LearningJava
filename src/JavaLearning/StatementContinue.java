class ContinueExample {
    public static void main(String [] args) {
        for(int i = 1; i <=10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

class ContinueExample2 {
    public static void main(String [] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

class ContinueExample3 {
    public  static void main(String [] args) {
        aa:
        for(int i = 1; i <= 3; i++) {
            bb:
            for(int j = 1; j<= 3; j++) {
                if(i == 2 && j == 2) {
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

class ContinueWhileExample {
    public static void main(String [] args) {
        int i = 1;
        while(i <= 10) {
            if(i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

class ContinueDoWhileExample {
    public static void main(String [] args) {
        int i = 1;
        do {
            if(i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i <= 10);
    }
}