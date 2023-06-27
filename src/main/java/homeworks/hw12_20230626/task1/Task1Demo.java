package homeworks.hw12_20230626.task1;

public class Task1Demo {
  public static void main(String[] args) {
    ListOfNodes list1 = new ListOfNodes();
    list1.add(2);
    list1.add(3);
    list1.add(4);

    ListOfNodes list2 = new ListOfNodes();
    list2.add(7);
    list2.add(8);
    list2.add(3);

    int num = ListOfNodes.getSumReverseNumOfListNodes(list1, list2);

    System.out.println(num);
  }
}
