/*
public class SimpleList {
    No start = null;
    int size = 0;


    public void insertBeginning (int info) {
        No no= new No();
        no.info=info;
        no.next = start;
        start=no;
        size++;
    }

    public int removeBeginning(){
        if(start == null){
            return 0;
        }
        int info = start.info;

    }

*/






    public String toString() {
        String str= "(" + size + ")";
        No local = start;

        while(local != null){
            str+= local.info + "";
            local=local.next;
        }
        return str;
    }


    public static void main(String[]args){
        SimpleList list = new SimpleList();
        list.insertBeginning(12);
        System.out.println(list);
        list.insertBeginning(13);
        System.out.println(list);
        list.insertBeginning(14);
        System.out.println(list);
        list.toString();
    }
}
