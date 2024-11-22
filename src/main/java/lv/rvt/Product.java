package lv.rvt;

public class Product {
    public String name;
    public String location;
    public int weight;

    Product(String name, String location, int weight){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    Product(String name){
        this(name, "Nav zinams", 0);
    }
    
    Product(String name, String location){
        this(name, location, 0);
    }
        
    Product(String name, int weight){
        this(name, "Nav zinams", weight);
    }

    public String toString(){
        return name + " " + location + " " + weight;
    }
}

