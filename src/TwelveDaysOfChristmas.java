
    public class TwelveDaysOfChristmas {
        public static void songVerses(int verses) {

            switch (verses) {

                case 1 -> System.out.println("A partridge in a pear tree");
                case 2 -> System.out.println("Two turtle doves");
                case 3 -> System.out.println("Three french hens");
                case 4 -> System.out.println("Four colly birds");
                case 5 -> System.out.println("Five gold rings");
                case 6 -> System.out.println("Six geese a-laying");
                case 7 -> System.out.println("Seven swans a-swimming");
                case 8 -> System.out.println("Eight maids a-milking");
                case 9 -> System.out.println("Nine ladies dancing");
                case 10 -> System.out.println("Ten lords a-leaping");
                case 11 -> System.out.println("Eleven pipers piping");
                case 12 -> System.out.println("Twelve drummers drumming");
                default -> throw new RuntimeException();
            }


            int days;
            for (days = (verses - 1); days >= 1; days--) {
                switch (days) {

                    case 1 -> System.out.println("A partridge in a pear tree");
                    case 2 -> System.out.println("Two turtle doves");
                    case 3 -> System.out.println("Three french hens");
                    case 4 -> System.out.println("Four colly birds");
                    case 5 -> System.out.println("Five gold rings");
                    case 6 -> System.out.println("Six geese a-laying");
                    case 7 -> System.out.println("Seven swans a-swimming");
                    case 8 -> System.out.println("Eight maids a-milking");
                    case 9 -> System.out.println("Nine ladies dancing");
                    case 10 -> System.out.println("Ten lords a-leaping");
                    case 11 -> System.out.println("Eleven pipers piping");
                    case 12 -> System.out.println("Twelve drummers drumming");
                    default -> throw new RuntimeException();
                }
            }


        }



        public static void main (String[]args){
            songVerses(5);
        }
    }


