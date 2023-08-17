class Main{
    public static void main(String[] args) {
        Product P = new Product();
        Book B = new Book();
        Electronics E = new Electronics();
        Smartphone S = new Smartphone();

        P.setName("chair");
        P.setPrice(500);
        P.P_showDetails();

        E.setName("Television");
        E.setPrice(20000);
        E.setBrand("Samsung");
        E.setModel("Neo QLED");
        E.E_showDetails();

        S.setName("Iphone");
        S.setPrice(40000);
        S.setBrand("Apple");
        S.setModel("Iphone 99");
        S.setOperatingSystem("ios");
        S.S_showDetails();

        B.setName("OOP Programming");
        B.setPrice(250);
        B.setAuthor("John Doe");
        B.setPages(300);
        B.B_showDetails();

    }
}

class Product{
    private String name;
    private double price;

    Product(){

    }

    public void getName(){
        System.out.println("Product Name : " + this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void getPrice(){
        System.out.println("Product Price : " + this.price);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void P_showDetails(){
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
    }
}

class Book extends Product{
    private String author;
    private int pages;

    Book(){

    }

    public void getAuthor(){
        System.out.println("Author : " + this.author);
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void getPages(){
        System.out.println("Number of Pages : " + this.pages);
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void B_showDetails(){
        System.out.println("************************************************************");
        super.P_showDetails();
        System.out.println("Author : " + this.author);
        System.out.println("Number of Pages : " + this.pages);
    }
}

class Electronics extends Product{
    private String brand;
    private String model;

    Electronics(){

    }

    public void getBrand(){
        System.out.println("Brand : " + this.brand);
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void getModel(){
        System.out.println("Model : " + this.model);
    }

    public void setModel(String model){
        this.model = model;
    }

    public void E_showDetails(){
        System.out.println("************************************************************");
        super.P_showDetails();
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
    }
}

class Smartphone extends Electronics{
    private String OperatingSystem;

    Smartphone(){

    }

    public void getOperatingSystem(){
        System.out.println("Operating System : " + this.OperatingSystem);
    }

    public void setOperatingSystem(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }

    public void S_showDetails(){
        super.E_showDetails();
        System.out.println("Operating System : " + this.OperatingSystem);  
    }
}