class EX01 {
  public static void main(String args[]) {
    int a[][] = new int[5][5];
    int totalSum = 0, t1Sum = 0, t2Sum = 0, diagSum = 0;
    int r = 0;
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        a[i][j] = ++r;
      }
    }
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        totalSum += a[i][j];
        if(i<=j)
          t1Sum += a[i][j];
        if(i>=j)
          t2Sum += a[i][j];
        if(i==5-j)
          diagSum += a[i][j];
      }
    }
    System.out.println(totalSum);
    System.out.println(t2Sum);
    System.out.println(t1Sum);
    System.out.println(diagSum);
  }


}
