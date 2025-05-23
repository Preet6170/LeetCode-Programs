class Solution {
    public ListNode reverseList(ListNode head) {
if (head == null || head.next == null)
      return head;

    ListNode newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;  

// if(head == null)
//             return head;
//         ListNode temp = head;
//         ArrayList<Integer> arr = new ArrayList<>();
//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }
//         temp = head;
//         int i = arr.size()-1;
//         while(temp!=null){
//             temp.val = arr.get(i--);
//             temp=temp.next;
//         }

//         return head;
    }
}
