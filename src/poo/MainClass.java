package src.poo;

import java.util.Date;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Item tuna = new Item();
        System.out.println("Introduzca el nombre de Item: ");
        tuna.name = scanner.nextLine();
        System.out.println("Introduzca el precio: ");
        tuna.price = scanner.nextDouble();
        tuna.calculateTax();
        System.out.println("Introduzca el dia de vencimiento: ");
        int day= scanner.nextInt();
        System.out.println("Introduzca el mes de vencimiento: ");
        int month= scanner.nextInt();
        System.out.println("Introduzca el año de vencimiento: ");
        int year= scanner.nextInt();
        tuna.expirationDate=new Date(year - 1900,month,day);

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
