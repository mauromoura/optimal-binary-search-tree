package br.com.ufu;

public class Main {

  public static void main(String[] args) {

    double p[] = new double[] {0, 0.15, 0.10, 0.05, 0.10, 0.20};
    double q[] = new double[] {0.05, 0.10, 0.05, 0.05, 0.05, 0.10};

    int n = 5;

    double w[][] = new double[n + 2][n + 1];
    double e[][] = new double[n + 2][n + 1];
    int root[][] = new int[n + 1][n + 1];

    DynamicOBST.calculateOBST(p, q, n, w, e, root);

    // constructOBST(root, q, p);

    System.out.println("[Dynamic] Optimal binary search tree value -> " + e[1][n]);

    double resursiveResult = RecursiveOBST.calculateOBST(p, q, 1, 5);

    System.out.println("[Recursive] Optimal binary search tree value -> " + resursiveResult);


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
