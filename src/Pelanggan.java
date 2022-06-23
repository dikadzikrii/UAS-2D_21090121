public class Pelanggan {
    public String TokoSejahtera;
    public String TokoHasilBumi;
    public String TokoBersama;
    public String TokoRizki;
    public String TokoSarinah;
    public String TokoBening;

    public Pelanggan(String TS,String TB,String Tbr,String TR,String Tsr,String TBn){
        this.TokoSejahtera = TS;
        this.TokoHasilBumi = TB;
        this.TokoBersama = Tbr;
        this.TokoRizki = TR;
        this.TokoSarinah = Tsr;
        this.TokoBening = TBn;
    }

    public class BinarySearchTree{
        public class Node{
            int key;
            Node left,right;

            public Node(int item)
            {
                key = item;
                left = right = null;
            }
        }

        public Node search(Node root, int key)
        {
            if (root==null || root.key==key)
                return root;
            if (root.key < key)
                return search(root.right,key);
            return search(root.left,key);
        }
    }
}