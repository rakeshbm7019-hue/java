public class ArrayListDemo{
    public static void main(String[]args){
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);

        list.add(1,4);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);
    }
}