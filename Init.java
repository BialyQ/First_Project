import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Init {

    private ArrayList<Telephone> telList;
    public Scanner sc;

    public Init() {
        telList = new ArrayList();
        sc = new Scanner(System.in);
    }

    public void userCreate() {
        System.out.print("Type add to add new Telephone: ");
        String typed = sc.nextLine();

        while (typed.equals("add")) {
            if (typed.equals("add")) {
                System.out.print("Type brand: ");
                String brand = sc.nextLine();
                System.out.print("Type model: ");
                String model = sc.nextLine();
                System.out.print("Type color: ");
                String c = sc.nextLine();
                Color color = Color.getColor(c);
                System.out.print("Type price: ");
                double price = sc.nextDouble();
                System.out.print("Type ram size: ");
                int ram = sc.nextInt();
                System.out.print("Type memory size: ");
                int memory = sc.nextInt();
                this.telList.add(new Telephone(brand, model, color, price, ram, memory));
                System.out.print("\nCongratulation! You have added new Telephone; ID: " + Telephone.getCount());
                System.out.println("\nWhat would you like to do? Type add to add next; Type close to end edit");
                typed = sc.nextLine();
                typed = sc.nextLine();
                
            }

        }

    }

    public ArrayList<Telephone> getTelList() {
        return telList;
    }

    public static void main(String[] args) {

        Init in = new Init();
        in.userCreate();
        

        for (Telephone t : in.getTelList()) {
            t.getInfo();
            t.getDetails();
            t.drawLine();
        }
        System.out.println(in.getTelList().isEmpty());
    }

}
