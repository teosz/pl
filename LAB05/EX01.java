class EX01 {
  public static void main(String args[]) {
    int[] a = {5,2,4,6,3,0};
    int[] reversed = rev2(a);
    for(int i=0;i<reversed.length;i++) {
      System.out.print(reversed[i]+ " ");
    }
    System.out.print("\n");
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
