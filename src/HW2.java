/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erkan_kaya_hw2;

/**
 *
 * @author eerka
 */
public class HW2 {
     
/**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 
 LinkedList myList = new LinkedList();
 try {
 myList.Insert(1, 0);
 myList.Insert(2, 0);
 myList.Insert(3, 0);
 myList.Insert(3, 0);
 myList.Insert(3, 0);
 myList.Insert(3, 0);
 myList.Insert(2, 0);
 myList.Insert(2, 0);
 myList.Insert(2, 0);
 myList.Insert(2, 0);
 myList.Insert(9, 5);
 myList.Insert(9, 6);
 myList.Insert(1, 0);
 myList.Insert(2, 0);
 myList.Insert(2, 0);
 myList.Insert(3, 0);
 myList.Insert(2, 0);
 myList.Insert(5, 54);
 } catch (Exception ex) {
 System.out.println(ex.toString());
 }

 myList.Output();
 
 myList.ReverseLink();
 myList.Output();

myList.SquashL();
myList.OplashL();
 
 myList.ROutput();
System.out.println(myList);
 }
} 

