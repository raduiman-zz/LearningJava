class SwitchExample {
    public static void main(String[] args) {
        int number = 20;
        switch(number) {
            case 10: System.out.println("10");
            break;
            case 20: System.out.println("20");
            break;
            case 30: System.out.println("30");
            break;
            default: System.out.println("Not in 10, 20 or 30");
        }
    }
}

class SwitchMonthExample {
    public static void main(String[] args) {
        int month = 6;
        String monthString = "";
        switch(month){
            case 1: monthString = "1 - Januray";
            break;
            case 2: monthString = "2 - February";
            break;
            case 3: monthString = "3 - March";
            break;
            case 4: monthString = "4 - April";
            break;
            case 5: monthString = "5 - May";
            break;
            case 6: monthString = "6 - June";
            break;
            case 7: monthString = "7 - July";
            break;
            case 8: monthString = "8 - August";
            break;
            case 9: monthString = "9 - September";
            break;
            case 10: monthString = "10 - October";
            break;
            case 11: monthString = "11 - November";
            break;
            case 12: monthString = "12 - December";
            break;
        }
        System.out.println(monthString);
    }
}

class SwitchVowelExample {
    public static void main(String[] args) {
        char ch = 'O';
        switch(ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

class SwitchExample2 {
    public static void main(String[] args) {
        int number = 20;
        switch(number) {
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default: System.out.println("Not in 10, 20 or 30");
        }
    }
}

class SwitchStringExample {
    public static void main(String[] args) {
        String levelString = "Expert";
        int level = 0;
        switch(levelString) {
            case "Beginner": level = 1;
            break;
            case "Intermediate": level = 2;
            break;
            case "Expert": level = 3;
            break;
            default: level = 0;
            break;
        }
        System.out.println("Your Level is: " + level);
    }
}

class NestedSwitchExample {
    public static void main(String[] args) {
        char branch = 'C';
        int collegeYear = 4;
        switch(collegeYear){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}

class JavaSwitchenumExample {
    public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat }
    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for(Day Now : DayNow) {
            switch(Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}

class WrapperInSwtichCaseExample {
    public static void main(String[] args) {
        Integer age = 18;
        switch(age) {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}