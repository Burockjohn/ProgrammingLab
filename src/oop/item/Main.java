package oop.item;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Item item = new Item(input.nextLine(), input.nextDouble());
        System.out.println(item);

    }
}
