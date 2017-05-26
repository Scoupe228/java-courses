public class Calculate{
         public static void main(String[] arg) {
             System.out.println("Calculate...");
             int first = Integer.valueOf(arg[0]);
             int second = Integer.valueOf(arg[1]);
             int summ = first + second;
             System.out.println("sum "+ summ);
             int third = Integer.valueOf(arg[2]);
             int fourth = Integer.valueOf(arg[3]);
             int minus = third - fourth;
             System.out.println("minus "+ minus);
             int fifth = Integer.valueOf(arg[4]);
             int sixth = Integer.valueOf(arg[5]);
             int multiply = fifth * sixth;
             System.out.println("multiply "+ multiply);
         }

}