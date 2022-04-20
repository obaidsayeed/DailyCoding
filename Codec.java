/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
 
        ArrayList<String> arr = new ArrayList<>();
        while (!s.isEmpty()) {
            TreeNode curr = s.pop();
            if (curr == null) {
                arr.add("-1");
            }
            else {
                arr.add("" + curr.val);
                s.push(curr.right);
                s.push(curr.left);
            }
        }
        return String.join(",", arr);

    }
    static int i;
    public TreeNode deserialize(String data) {
        if(data == null)
        {
            return null;
        }
        i = 0;
        String arr[] = data.split(",");
        return helper(arr);
	}
    
    public static TreeNode helper(String arr[])
    {
        if(arr[i].equals("-1"))
        {
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        root.left = helper(arr);
        i++;
        root.right = helper(arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
