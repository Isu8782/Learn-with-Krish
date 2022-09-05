public class Phone implements ProtoType{

    private int Ram;
    private int storage;
    private String brand;

    public Phone(int Ram,int Storage,String Brand){

        this.Ram=Ram;
        this.storage=Storage;
        this.brand=Brand;

    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Phone clone() {
        Phone phone=new Phone(this.Ram,this.storage,this.brand);
        return phone;
    }

    @Override
    public String toString() {
        String detail="Brand: "+this.brand+" "+"Ram: "+this.Ram+" "+"Storage: "+this.storage;
        return detail;
    }
}
