package algorithms;

import algorithms.model.BTNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Joy
 * @Date 2021/8/25
 */
public class LevelTraversalBT {

    static void level(BTNode head) {
        if (head == null) {
            return;
        }
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            BTNode cur = queue.poll();
            System.out.println(cur.value);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }
    public static void main(String[] args) {
        BTNode head = new BTNode(1);
        head.left = new BTNode(2);
        head.right = new BTNode(3);
        head.left.left = new BTNode(4);
        head.left.right = new BTNode(5);
        head.right.left = new BTNode(6);
        head.right.right = new BTNode(7);

        level(head);
        System.out.println("========");
    }
}
