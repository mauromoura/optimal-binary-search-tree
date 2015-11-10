package br.com.ufu;

public class RecursiveOBST {

  public static double calculateOBST(double[] p, double[] q, int i, int j) {
    if (j < i) {
      return q[i - 1];
    } else {
      double e = Double.MAX_VALUE;
      for (int r = i; r <= j; r++) {
        double t =
            calculateOBST(p, q, i, r - 1) + calculateOBST(p, q, r + 1, j) + sumWeights(p, q, i, j);
        if (t < e) {
          e = t;
        }
      }
      return e;
    }

  }

  private static double sumWeights(double[] p, double[] q, int i, int j) {
    double sum = 0;
    for (int x = i; x <= j; x++) {
      sum += p[x];
    }
    for (int x = i - 1; x <= j; x++) {
      sum += q[x];
    }
    return sum;
  }


}
