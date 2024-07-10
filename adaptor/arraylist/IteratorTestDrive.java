package adaptor.arraylist;

import java.util.ArrayList;

public class IteratorTestDrive {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        ArrayListAdapter adapter = new ArrayListAdapter(arrayList.iterator());

        while(adapter.hasMoreElements()) {
            System.out.println(adapter.nextElement());
        }

    }
    
}
