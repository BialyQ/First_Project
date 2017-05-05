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

    public void inputConstr() {

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
        String eatLine = sc.nextLine();
        this.telList.add(new Telephone(brand, model, color, price, ram, memory));
        System.out.println("\nSuccessful! You have added new Telephone; ID: " + Telephone.getCount());
        System.out.println();

    }

    public void closeInputConstr() {
        System.out.println("See you next time (:");
        System.exit(0);
    }

    public void showMenu() {
        System.out.print("Type: \t\"add\" to add new Telephone;" + "\n\t\"close\" to end edition: ");
    }

    public void showInputErr() {
        System.out.println("Unknown Command!");
    }

    public void whatToDo() {
        String typedMsg;

        do {
            showMenu();
            typedMsg = sc.nextLine();
            if (typedMsg.equals("add")) {
                inputConstr();
            } else if (typedMsg.equals("close")) {
                closeInputConstr();
            } else {
                showInputErr();
            }
        } while (!(typedMsg.equals("close")));
    }

    public ArrayList<Telephone> getTelList() {
        return telList;
    }

    public static void main(String[] args) {

        Init in = new Init();
        in.whatToDo();

        for (Telephone t : in.getTelList()) {
            t.getInfo();
            t.getDetails();
            t.drawLine();
        }
        System.out.println(in.getTelList().isEmpty());
    }

}
