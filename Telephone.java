package first;


import java.awt.Color;

class Telephone{
    
    private final static String tab = "\t";
    private static int count;
    private int ID;
    private String brand;
    private String model;
    private Color color;
    private int ram;
    private int memory;
    private double price;
    
    
    public Telephone(){
        count++;
        ID = count;
        
    }
    public Telephone(String brand, String model, Color color, double price, int ram, int memory){
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.memory = memory;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public static int getCount() {
        return count;
    }

    public int getID() {
        return ID;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void getInfo(){
        System.out.println("ID: "+ID+tab+"Brand: "+getBrand()+tab+"Model: "+getModel()+tab+"Price: "+getPrice());
    }
    public void getDetails(){
        System.out.println("Color: "+getColor()+tab+"Ram: "+getRam()+tab+"Memory: "+getMemory());
    }
    public void drawLine(){
        System.out.println("--------------------------------------------------------------------------");
    }


    
    
}
