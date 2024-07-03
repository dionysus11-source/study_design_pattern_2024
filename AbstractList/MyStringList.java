package AbstractList;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] myList;
    MyStringList(String[] strings){
        myList = strings;
    }

    @Override
    public int size() {
        return myList.length;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    public String set(int index, String item){
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
    
}
