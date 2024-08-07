package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try {
            if(method.getName().equals("setGeekRating")) {
                return method.invoke(person, args);
            } else if(method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            } else if(method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
        } catch(InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
