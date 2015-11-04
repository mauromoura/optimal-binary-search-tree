package br.com.ufu;

public class Node {

  private String id;
  private double probability;
  private Node left;
  private Node right;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getProbability() {
    return probability;
  }

  public void setProbability(double probability) {
    this.probability = probability;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

}
