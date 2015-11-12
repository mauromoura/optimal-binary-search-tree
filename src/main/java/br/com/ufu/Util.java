package br.com.ufu;

public class Util {

  public static double[][] createRandomNodes(int n) {

    double[][] result = new double[2][n + 1];

    Double[] probabilities = new Double[(2 * n) + 1];
    double sum = 0;

    for (int i = 0; i < (2 * n) + 1; i++) {
      probabilities[i] = Math.random();
      sum += probabilities[i];
    }

    for (int i = 0; i < (2 * n) + 1; i++) {
      probabilities[i] = probabilities[i] / sum;
    }

    int count = 0;

    for (int i = 1; i <= n; i++) {
      result[0][i] = probabilities[count++];
    }


    for (int i = 0; i < n; i++) {
      result[1][i] = probabilities[count++];
    }

    // System.out
    // .printf("%.2f\n",Arrays.asList(probabilities).stream().mapToDouble(Double::doubleValue).sum());

    return result;
  }

}
