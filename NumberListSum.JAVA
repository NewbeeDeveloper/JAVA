/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseorder;

/**
 *
 * @author eduardoecheverria
 */
// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode() {
    }
}

public class ReverseOrder {

    static ListNode root;

    public static void push(int num) {

        ListNode eNode = new ListNode(num);

        eNode.next = root;

        root = eNode;

    }

    public static ListNode suma(ListNode l1, ListNode l2) {

        int i     = 0;
        int j     = 0;
        int dsum  = 0;
        int sum   = 0;
        int count = 0;

        String digits = "";
        String dec    = "";

        ListNode result = null;

        while (l1 != null) {

            ListNode aux = new ListNode();

            do {

                sum = l1.val + l2.val + count;
                count = 0;

                if (sum >= 10 && l1.next != null) {

                    digits = String.valueOf(sum);
                    dsum = digits.length();

                    for (int k = 1; k <= digits.length(); k++) {

                        if (k == dsum) {
                            aux.val = Character.getNumericValue(digits.charAt(digits.length() - 1));
                            count = Integer.parseInt(dec);
                        } else if (k <= dsum - 1) {
                            dec = dec + digits.charAt(k - 1);
                        }
                    }

                    if (result != null) {
                        aux.next = result;
                    }

                    result = aux;

                } else {

                    if (sum > 0) {

                        digits = String.valueOf(sum);
                        dsum = digits.length();

                        for (int k = digits.length() - 1; k >= 0; k--) {

                            aux = new ListNode();
                            aux.val = Character.getNumericValue(digits.charAt(k));
                            aux.next = result;
                            result = aux;

                        }

                    } else {
                        aux.val = sum;
                    }
                }

                l2 = l2.next;
                j++;

                sum = 0;
                dec = "";

            } while (i == j);

            l1 = l1.next;

            i++;
        }

        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        ReverseOrder.push(2);
        ReverseOrder.push(4);
        ReverseOrder.push(3);

        l1 = root;
        root = new ListNode();

        ReverseOrder.push(2);
        ReverseOrder.push(4);
        ReverseOrder.push(3);

        l2 = root;
        root = new ListNode();

        root = ReverseOrder.suma(l1, l2);


    }

}
