package casa;

public class Main {
    public static void main(String[] args) {


        Casa casadajeizy = new Casa();


        casadajeizy.setQuartos(7);
        casadajeizy.setBanheiro(8);
        casadajeizy.setRua("Avenida Doutor Silas Munguba Fortaleza");


        System.out.println("Quartos: " + casadajeizy.getQuartos());
    }
}
