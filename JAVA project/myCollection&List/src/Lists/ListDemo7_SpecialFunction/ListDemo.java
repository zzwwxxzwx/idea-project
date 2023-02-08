package Lists.ListDemo7_SpecialFunction;

/*
                方法名                                说明
    public void addFirst(E e)           在该列表开头插入指定的元素
    public void addLast(Ee)             将指定的元素追加到此列表的末尾
    public E getFirst()                 返回此列表中的第一个元索
    public E getLast()                  返回此列表中的最后一个元素
    public E removeFirst()              从此列表中删除并返回第一个元素
    public E removeLast()               从此列表中册删除并返回最后一个元素

 */


import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

//        public void addFirst(E e)           在该列表开头插入指定的元素
//        public void addLast(Ee)             将指定的元素追加到此列表的末尾
//        linkedList.addFirst("javaee");
//        linkedList.addLast("javaend");

//        public E getFirst()                 返回此列表中的第一个元索
//        public E getLast()                  返回此列表中的最后一个元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

//        public E removeFirst()              从此列表中删除并返回第一个元素
//        public E removeLast()               从此列表中册删除并返回最后一个元素
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());


        System.out.println(linkedList);
    }
}
