package LinkHashMap;

public class MyLinkHashMap {
   private Node[] a=new Node[5];
   private Node root;
   public String get(int key)
   {
       int index=key%a.length;
       Node temp=a[index];
       while(temp!=null)
       {
           if(temp.key==key)
               return temp.value;
           temp=temp.HashTableNext;
       }
       return null;
   }
    public void print()
    {
        Node temp=root;
        while (temp!=null)
        {
            System.out.println(temp.key+" "+ temp.value);
            temp=temp.linkListNext;
        }
    }
    public void add(int key,String value)
    {
        Node node=new Node();
        node.key=key;
        node.value=value;
        int index=key%a.length;
        if (a[index]==null)
            a[index]=node;
        else {
            Node temp=root;
            while (temp.HashTableNext!=null)
            {
                temp=temp.HashTableNext;
            }
            temp.HashTableNext=node;
        }




        if (root == null)
            root= node;
        else {
            Node temp = root;
            while (temp.linkListNext != null) {
                temp = temp.linkListNext;
            }
            temp.linkListNext = node;

        }
    }
}
