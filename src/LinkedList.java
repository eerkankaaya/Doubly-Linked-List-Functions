/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erkan_kaya_hw2;

/**
 *
 * @author eerka
 */
public class LinkedList implements HW2Interface{

   private DLNode head;

    public LinkedList() {
        this.head = null;
    }

    @Override
    public void Insert(int newElement, int pos) throws Exception {
        if (pos < 0) {
        throw new Exception("Position is invalid");
    }

    DLNode newNode = new DLNode(newElement);

    if (head == null) {
        if (pos != 0) {
            throw new Exception("Position is invalid for an empty list");
        }
        head = newNode;
        return;
    }

    if (pos == 0) {
        newNode.right = head;
        head.left = newNode;
        head = newNode;
        return;
    }

    DLNode temp = head;
    int currentPosition = 0;

    while (temp != null && currentPosition < pos - 1) {
        temp = temp.right;
        currentPosition++;
    }

    if (temp == null) {
        throw new Exception("Position is invalid");
    }

    newNode.right = temp.right;
    if (temp.right != null) {
        temp.right.left = newNode;
    }

    temp.right = newNode;
    newNode.left = temp;
    }

    @Override
    public int Delete(int pos) throws Exception {
       if (head == null || pos < 0) {
        throw new Exception("Position is invalid or list is empty");
    }

    if (head.Element == pos) {
        int valueDeleted = head.Element;
        head = head.right;
        if (head != null) {
            head.left = null;
        }
        return valueDeleted;
    }

    DLNode temp = head;
    while (temp.right != null && temp.right.Element != pos) {
        temp = temp.right;
    }

    if (temp.right == null) {
        throw new Exception("Element not found in the list");
    }

    int valueDeleted = temp.right.Element;
    DLNode nodeDeleted = temp.right;
    temp.right = nodeDeleted.right;
    if (temp.right != null) {
        temp.right.left = temp;
    }

    nodeDeleted.left = null;
    nodeDeleted.right = null;

    return valueDeleted;
    }

    @Override
   public void ReverseLink() {
    if (head == null || head.right == null) {
        return;
    }

    DLNode current = head;
    DLNode temp = null;

    while (current != null) {
        temp = current.left;
        current.left = current.right;
        current.right = temp;

        current = current.left;
    }

    head = temp != null ? temp.left : null;
}
@Override
public void SquashL() {
    System.out.print("The Elements in the list are : ");
    if (head == null) {
        return;
    }

    DLNode current = head;
    while (current != null) {
        int element = current.Element;
        int count = 0;

        DLNode temp = current;
        while (temp != null && temp.Element == element) {
            count++;
            temp = temp.right;
        }

        DLNode newNode = new DLNode(element);
        newNode.right = new DLNode(count);
        
        newNode.left = current.left;
        if (current.left != null) {
            current.left.right = newNode;
        }

        newNode.right.left = newNode;
        newNode.right.right = temp;
        if (temp != null) {
            temp.left = newNode.right;
        }

       
        System.out.print(newNode.Element + " ");
        System.out.print(newNode.right.Element + " ");

        
        current = temp;
    }
    System.out.println();
}

@Override
public void OplashL() {
    System.out.print("The Elements in the list are : ");
    DLNode current = head;
        while (current != null) {
            System.out.print(current.Element + " ");
            current = current.right;
        }
        System.out.println();
}

    @Override
    public void Output() {
        System.out.print("The Elements in the list are : ");
        DLNode current = head;
        while (current != null) {
            System.out.print(current.Element + " ");
            current = current.right;
        }
        System.out.println();
    }

    @Override
  public void ROutput() {
    System.out.print("The Elements in the list are : ");
      reverseOutputRecursive(head);
    System.out.println();
}

   private void reverseOutputRecursive(DLNode current) {
    if (current == null) {
        return;
    }

    reverseOutputRecursive(current.right);

    System.out.print(current.Element + " ");
}

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        DLNode current = head;
        while (current != null) {
            result.append(current.Element).append(" ");
            current = current.right;
        }
        return result.toString().trim();
    }

    @Override
    public Exception LinkedListException() {
        return new Exception("Linked list exception");
    }}