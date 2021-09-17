package src.poo;

import java.util.Date;

public class MainClass {

    public static void main(String[] args) {

        Item tuna = new Item();
        tuna.name = "Atun Gomez";
        tuna.price = 180.0;
        tuna.calculateTax();
        tuna.expirationDate=new Date(2021,8,12);

        if (tuna.canItBeSold()){
        System.out.println("Nombre del Item:" +tuna.name);
        System.out.println("Precio del Item:" +tuna.price);
        System.out.println("Impuesto del Item:" +tuna.tax);
        System.out.println("Total a Pagar por el Item:" +tuna.getTotalToPay());
    }else{
            System.out.println("Este Item no esta actualizado para la venta");
        }
}
}
