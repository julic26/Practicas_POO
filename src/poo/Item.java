package src.poo;

import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate;

    public Double getTotalToPay(){
        return price + tax;
    }

    public void calculateTax(){
        tax = price * 19.0;

    }
    public Boolean canItBeSold(){
        Date today = new Date();
        return expirationDate.after(today);
        }

    }




