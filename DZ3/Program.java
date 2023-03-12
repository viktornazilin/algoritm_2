public class Program {

    public static void main(String[] args) {
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Viktor", 23));
        linkedList.addFirst(new Employee("Sergei", 47));
        linkedList.addFirst(new Employee("Anna", 35));
        //linkedList.removeFirst();
        linkedList.directSort(new EmployeeNameComparator(SortType.Ascending));
        printList(linkedList);
        System.out.println();
        linkedList.directSort(new EmployeeNameComparator(SortType.Descending));
        printList(linkedList);
        System.out.println();
        linkedList.reverseList();
        printList(linkedList);
        System.out.println();
    }

    public static void printList(LinkedList<Employee> list){
        LinkedList<Employee>.Node node = list.head;
        while (node != null){
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }

    }

}

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}