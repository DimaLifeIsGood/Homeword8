import java.security.SecureRandom;

public class Phone {
private int  number;
private String model;
private int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Zwonit   "+name);
            }
    public void receiveCall(String name,int number){
        System.out.println("Zwonit  "+ name+ "nomer  "+number);

    }
    public void sendMasage(int ... a){
        for(int x:a){
            System.out.println(x);
        }

    }
}
