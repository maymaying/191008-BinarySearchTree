public class Contact {

    //Key-Value模型
    public static class Node {
        String name;
        String phone;

        Node left;
        Node right;
    }

    private Node root = null;

    public String update(String name, String phone) {
        Node cur = root;
        while (cur != null) {
            int r = name.compareTo(cur.name);
            if (r == 0) {
                String oldPhone = cur.phone;
                cur.phone = phone;
                return oldPhone;
            } else if (r < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        return null;
    }

    public String search(String name) {
        Node cur = root;
        while (cur != null) {
            int r = name.compareTo(cur.name);
            //String类型不能用直接用 <，> 比较

            if (r == 0) {
                return cur.phone;
            } else if (r < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        return null;
    }
}
