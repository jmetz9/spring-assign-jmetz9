package edu.wctc.input;

import edu.wctc.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements ISalesInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        boolean loop = true;

        while(true){
            System.out.print("Enter Costumer Name:");
            String custumer = scanner.nextLine();

            System.out.print("Enter Country:");
            String country = scanner.nextLine();

            System.out.print("Enter Sale Amount:");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Tax Amount:");
            double tax = Double.parseDouble(scanner.nextLine());

            Sale sale = new Sale(custumer, country, amount, tax);
            sales.add(sale);
            //System.out.println("Successfully added sale: " + custumer + ", " + country + ", $" + amount + ", $" + tax);

            System.out.print("Add another sale?(Y/N):");
            String answer = scanner.nextLine();
            if(!answer.equalsIgnoreCase("y")){
                break;
            }
        }

        return sales;
    }
}
