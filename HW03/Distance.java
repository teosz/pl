public class Distance {
  public static void main(String args[]) {
    System.out.println(distance(0,0,4,5));
  }
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
  }
}
