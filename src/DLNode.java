/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erkan_kaya_hw2;

/**
 *
 * @author eerka
 */
public class DLNode {
    public int Element;
    public DLNode left;
    public DLNode right;

    public DLNode(int element) {
        this.Element = element;
        left=null;
         right=null;
    }
}
