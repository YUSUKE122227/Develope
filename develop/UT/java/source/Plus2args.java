public class Plus2args {
        public static void main (String[] args){
                add(args);
        }

        public static void add(final String[] args) {
                int number;
                number = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
                System.out.println(number);
                System.exit(0);
        }
}