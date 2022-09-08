package edu.wctc.input;

import edu.wctc.Sale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements ISalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try{
            File file = new File("C:\\Users\\pengu\\IdeaProjects\\spring-assign-jmetz9\\src\\main\\java\\edu\\wctc\\sales.txt");
            Scanner reader = new Scanner(file);
            String line = reader.nextLine();

            while(true){
                String[] arr = line.split(",");

                String customer = arr[0];
                String country = arr[1];
                double amount = Double.parseDouble(arr[2]);
                double tax = Double.parseDouble(arr[3]);

                Sale sale = new Sale(customer, country, amount, tax);
                sales.add(sale);
                //System.out.println("Successfully added sale: " + customer + ", " + country + ", $" + amount + ", $" + tax);

                if(reader.hasNextLine()){
                    line = reader.nextLine();
                }
                else{
                    break;
                }
            }
            reader.close();
        }

        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }


        return sales;
    }
}
