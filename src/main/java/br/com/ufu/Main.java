package br.com.ufu;

public class Main {

  public static void main(String[] args) {
    for (int i = 5; i < 10000; i++) {
      double[][] testCases = Util.createRandomNodes(i);
      calculate(testCases[0], testCases[1], i);
    }
  }

  public static void calculate(double p[], double q[], int n) {

    // double p[] = new double[] {0, 0.15, 0.10, 0.05, 0.10, 0.20};
    // double q[] = new double[] {0.05, 0.10, 0.05, 0.05, 0.05, 0.10};

    double w[][] = new double[n + 2][n + 1];
    double e[][] = new double[n + 2][n + 1];
    int root[][] = new int[n + 1][n + 1];

    long startTime = System.currentTimeMillis();
    DynamicOBST.calculateOBST(p, q, n, w, e, root);
    long elapsedTime = System.currentTimeMillis() - startTime;
    System.out.print(elapsedTime + ";");

    startTime = System.currentTimeMillis();
    double resursiveResult = RecursiveOBST.calculateOBST(p, q, 1, n);
    elapsedTime = System.currentTimeMillis() - startTime;
    System.out.println(elapsedTime);

    double dynamicResult = e[1][n];
    if (Math.abs(dynamicResult - resursiveResult) > 0.000001) {
      System.out.println("MISMATCH ->" + dynamicResult + " * " + resursiveResult);
    }

  }


  public static void constructOBST(int root[][], double q[], double p[]) {
    int n = root[0].length - 2;
    System.out.println("k" + root[1][n] + " is root");
    constructOBSTAux(root, 1, n, q, p);
  }

  public static void constructOBSTAux(int root[][], int i, int j, double q[], double p[]) {
    int m = root[i][j];
    if (i == m) {
      System.out.println("d" + (m - 1) + " is on the left of k" + m);
    } else {
      System.out.println("k" + root[i][m - 1] + " is on the left of k" + m);
      constructOBSTAux(root, i, m - 1, q, p);
    }
    if (j == m) {
      System.out.println("d" + (m) + " is on the right of k" + m);
    } else {
      System.out.println("k" + root[m + 1][j] + " is on the right of k" + m);
      constructOBSTAux(root, m + 1, j, q, p);
    }
  }

}
