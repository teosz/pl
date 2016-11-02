public class MatrixOperations {
  public static void main(String args[]) {
    double[][] a = {{1,2}, {1,2}};
    double[][] b = {{6,3}, {2,4}};
    double[][] result = matrixAdd(a,b);
    showMatrix(result);
  }
  public static double[][] matrixAdd(double m1[][], double m2[][]) {
    double[][] result = new double[m1.length][m1[0].length];
    for(int i=0;i<m1.length;i++) {
      for(int j=0;j<m1[i].length;j++) {
          result[i][j] = m1[i][j] + m2[i][j];
      }
    }
    return result;
  }
  public static double matrixDiagSum(double m1[][])
  {
    int i;
    double sum=0.0;
    for(i=0;i<m1.length;i++)
      sum+=m1[i][i];
    return sum;
  }
  private static void showMatrix(double a[][])
  {
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a[i].length;j++) {
        System.out.print(a[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
