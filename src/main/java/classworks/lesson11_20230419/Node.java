package classworks.lesson11_20230419;

public class Node {
  public Node left;
  public Node right;
  public Integer value;

  private static boolean isNodeExist(Node node) {
    return node != null && node.value != null;
  }

  private static void createNode(Node node, int value) {
    node.left = new Node();
    node.right = new Node();
    node.value = value;
  }

  private static Node getMin(Node node) {
    if (!isNodeExist(node)) {
      return null;
    }

    if (!isNodeExist(node.left)) {
      return node;
    }

    return getMin(node.left);
  }

  //todo
//    private static Node getMax(Node node) {
//
//    }

  private static Node search(Node node, int value) {
    if (!isNodeExist(node)) {
      return null;
    }

    if(node.value == value) {
      return node;
    }

    if(value < node.value) {
      return search(node.left, value);
    }

    return search(node.right, value);
  }

  private static void inOrderTraversal(Node node) {
    if (!isNodeExist(node)) {
      return;
    }

    inOrderTraversal(node.left);
    System.out.println("[ " + node.value + " ]");
    inOrderTraversal(node.right);
  }

  //todo
  private static void postOrderTraversal(Node node) {

  }

  //todo
  private static void directOrderTraversal(Node node) {

  }

  private static int getChildrenCount(Node node) {
    int count = 0;
    if(isNodeExist(node.left)) {
      count += 1;
    }

    if(isNodeExist(node.right)) {
      count += 1;
    }

    return count;
  }

  //todo mikhail
  private static Node getChildOrNull(Node node) {
    return isNodeExist(node.left) ? node.left : node.right;
  }

  //todo
  private static boolean remove(Node root, int value) {
    return false;
  }

  //todo mikhail
  private static int getDepth(Node root) {
    int count = 0;

    return count;
  }
}