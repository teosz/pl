import java.util.stream.IntStream;
class EX01 {
  public static void main(String args[]) {
    int n = 4;
    int factorial = IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    long factorialRecursive = fact(n);
    System.out.println(ak(4,2));
    // System.out.println(factorialRecursive);

  }
  public static int ak(int m, int n) {
    if(m == 0)
      return m+1;
    if(m > 0 && n==0)
      return ak(m-1,1);
    if(m > 0 && n>0)
      return ak(m-1,ak(m,n-1));
    return (n-1);
  }
  public static long fact(int n) {
    if(n == 0 || n == 1)
      return 1;
    return n*fact(n-1);
  }
  public static void rev1(int a[]) {
    for(int i=0;i<a.length/2;i++) {
      int schim = a[i];
      a[i] = a[a.length-i-1];
      a[a.length-i-1] = schim;
    }
  }
  public static int[] rev2(int a[]) {
    int[] b = new int[a.length];
    for(int i=0;i<a.length/2;i++) {
      b[i] = a[a.length-i-1];
      b[a.length-i-1] = a[i];
    }
    return b;
  }
  public static void sortArray(int a[]) {
    for(int i=0;i<a.length;i++) {
      for(int j=i;j<a.length;j++)
      {
        int schim;
        if(a[i] > a[j])
        {
          schim = a[j];
          a[j] = a[i];
          a[i] = schim;
        }
      }
    }
  }
  public static void sortArray(double a[]) {
    for(int i=0;i<a.length;i++) {
      for(int j=i;j<a.length;j++)
      {
        double schim;
        if(a[i] > a[j])
        {
          schim = a[j];
          a[j] = a[i];
          a[i] = schim;
        }
      }
    }
  }

}
