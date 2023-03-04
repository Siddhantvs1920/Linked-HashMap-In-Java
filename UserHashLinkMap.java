package LinkHashMap;

public class UserHashLinkMap {
    public static void main(String[] args) {
        MyLinkHashMap obj=new MyLinkHashMap();
        obj.add(12,"Pune");
        obj.add(14,"PCMC");
        obj.add(21,"Jalna");
        obj.add(20,"Aurangabad");
        obj.add(19,"Parabhani");
        obj.print();
        System.out.println(obj.get(21));
    }
}
