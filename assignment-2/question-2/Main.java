import java.util.Scanner;

class EmployeeList {

    static class Node {
        int id;
        String name;
        double salary;
        Node next;

        Node(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    Node head;

    void add(int id, String name, double salary) {
        Node n = new Node(id, name, salary);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.salary);
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " " + temp.name + " " + temp.salary);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Not found");
    }

    void delete(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Not found");
        }
    }

    void updateSalary(int id, double salary) {
        Node temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.salary = salary;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Not found");
    }

    void sortBySalary() {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.salary > j.salary) {
                    int tid = i.id;
                    String tname = i.name;
                    double tsal = i.salary;

                    i.id = j.id;
                    i.name = j.name;
                    i.salary = j.salary;

                    j.id = tid;
                    j.name = tname;
                    j.salary = tsal;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList list = new EmployeeList();

        int ch;

        do {
            System.out.println("\n1 Add");
            System.out.println("2 Display");
            System.out.println("3 Search by name");
            System.out.println("4 Delete by id");
            System.out.println("5 Update salary");
            System.out.println("6 Sort by salary");
            System.out.println("0 Exit");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter id name salary: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double sal = sc.nextDouble();
                    list.add(id, name, sal);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String n = sc.next();
                    list.searchByName(n);
                    break;

                case 4:
                    System.out.print("Enter id: ");
                    int did = sc.nextInt();
                    list.delete(did);
                    break;

                case 5:
                    System.out.print("Enter id and new salary: ");
                    int uid = sc.nextInt();
                    double usal = sc.nextDouble();
                    list.updateSalary(uid, usal);
                    break;

                case 6:
                    list.sortBySalary();
                    System.out.println("Sorted");
                    break;
            }

        } while (ch != 0);
    }
}