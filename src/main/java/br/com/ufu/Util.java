package br.com.ufu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

//  public static List<Node> createRandomNodes(int n) {
//
//    List<Node> result = new ArrayList<Node>();
//
//    Double[] probabilities = new Double[(2 * n) + 1];
//    double sum = 0;
//
//    for (int i = 0; i < (2 * n) + 1; i++) {
//      probabilities[i] = Math.random();
//      sum += probabilities[i];
//    }
//
//    for (int i = 0; i < (2 * n) + 1; i++) {
//      probabilities[i] = probabilities[i] / sum;
//    }
//
//    int count = 0;
//
//    for (int i = 0; i <= n; i++) {
//      result.add(new Node(probabilities[count++], MISS));
//    }
//
//
//    for (int i = 0; i < n; i++) {
//      result.add(new Node(probabilities[count++], MISS));
//    }
//
//    System.out
//        .println(Arrays.asList(probabilities).stream().mapToDouble(Double::doubleValue).sum());
//
//    return result;
//  }


  public static final String MISS = "miss";
  public static final String HIT = "hit";

}
