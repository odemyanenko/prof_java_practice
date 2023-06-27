package homeworks.hw12_20230626.task1;

public class ListOfNodes {
  private Node root;
  private Node tail;

  public void addFirst(int num) {
    Node node = new Node(num);

    if (root == null) {
      root = node;
      tail = node;
      return;
    }
    node.next = root;
    root = node;
  }

  public void add(int num) {
    Node node = new Node(num);

    if (root == null) {
      root = node;
      tail = node;
      return;
    }
    tail.next = node;
    tail = node;
  }

  public int getNodeNumList() {
    return getRecursiveNumList(root, 0);
  }

  private int getRecursiveNumList(Node node, int p) {
    if (node == null) {
      return 0;
    }
    return (int) ((node.v * Math.pow(10, p)) + getRecursiveNumList(node.next, ++p));
  }

  public static int getSumReverseNumOfListNodes(ListOfNodes list1, ListOfNodes list2){
    return list1.getNodeNumList() + list2.getNodeNumList();
  }
}
