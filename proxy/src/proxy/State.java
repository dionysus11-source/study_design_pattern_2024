package proxy;

import java.io.*;

abstract interface State extends Serializable{
    
    public void insertQuarter();
    public void ejectQuater();
    public void turnCrank();
    public void dispense(); 
}
