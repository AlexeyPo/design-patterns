package org.alexey.structural.facade;

import java.util.Scanner;

public class FacadeDemo {

    public static void main(String[] args) {
        new FacadeDemo().run();
    }

    private void run() {
        int choice;
        ShopKeeper shopKeeper = new ShopKeeper();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("1. IPHONE.              \n");
            System.out.print("2. SAMSUNG.              \n");
            System.out.print("3. NOKIA.                 \n");
            System.out.print("4. Exit.                   \n");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1: shopKeeper.iphoneSale(); break;
                case 2: shopKeeper.samsungSale(); break;
                case 3: shopKeeper.nokiaSale(); break;
                default:
                    System.out.println("Nothing You purchased");
            }
        } while (choice != 4);
    }
}
