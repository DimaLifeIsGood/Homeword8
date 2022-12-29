public class Main {
    public static void main(String[] args) {
       Phone phone1= new Phone(111222333,"Nokia",1000);
        Phone phone2= new Phone(111222444,"Motorolla",1100);
        Phone phone3= new Phone(111222555,"Samsung",1200);
        System.out.println(phone1.getModel()+"   "+phone1.getNumber()+"  "+phone1.getWeight());
        System.out.println(phone2.getModel()+"   "+phone2.getNumber()+"  "+phone2.getWeight());
        System.out.println(phone3.getModel()+"   "+phone3.getNumber()+"  "+phone3.getWeight());
        phone1.receiveCall("Dima");
        phone2.receiveCall("Oleg");
        phone3.receiveCall("Sanija");
        phone1.receiveCall("Mark",555666777);
        phone1.receiveCall("Justyna",555666888);
        phone1.receiveCall("Kamil",555666999);
        phone1.sendMasage(111,222,333,444);

                  }
}