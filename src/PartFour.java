public class PartFour {

  public static void main (String[] args) {
    int num = Integer.parseInt(args[0]);
    if(num%2 == 0) {
      System.out.format("%d is an even number. %n", num);
    }
    else {
      System.out.format("%d is an odd number. %n", num);
    }
  }

}
