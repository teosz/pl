class EX02 {
  public static void main(String args[]) {
    int directions[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    int a[][] = new int[5][5];
    int b[][] = new int[5][5];
    int c[][] = new int[5][5];
    int mark_c[][] = new int[5][5];
    int r = 0;
    int currentDirection = 0;
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        a[j][i] = ++r;
      }
    }
    r=0;
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        if(i%2 == 0)
        b[i][j] = ++r;
        else
        b[i][5-j-1] = ++r;
      }
    }
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        if(i%2 == 0)
        b[i][j] = ++r;
        else
        b[i][5-j-1] = ++r;
      }
    }
    r=0;
    for(int i=0;i<5;i++)
      for(int j=0;j<5;j++)
        mark_c[i][j] = 0;
    for(int i=0;i<5;i=i+directions[currentDirection][0]) {
      for(int j=0;j<5;j=j+directions[currentDirection][1]) {
        System.out.println(mark_c[i][j]);
        System.out.println(i + " " + j);
        if(mark_c[i][j] == 0)
        {
          c[i][j] = ++r;
          mark_c[i][j] = 1;
        }
        else {
            currentDirection = (currentDirection+1)%3;
        }
      }
    }

    showMatrix(a);
    System.out.print("\n");
    showMatrix(b);
    System.out.print("\n");
    showMatrix(c);
    System.out.print("\n");
  }
  private static void showMatrix(int a[][])
  {
    for(int i=0;i<5;i++) {
      for(int j=0;j<5;j++) {
        System.out.print(a[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
