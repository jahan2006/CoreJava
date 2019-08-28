package ooppractice13;



public class Bmw {
    Car car = new Car();

    public int getHorsPower(){
        int newHp=car.horsepower;
        return newHp;
    }
    public static void main(String[] args) {
        Bmw bmw =new Bmw();
        int Storingvariable=bmw.getHorsPower();
        bmw.getHorsPower();
        System.out.println(bmw.getHorsPower()+100);
        System.out.println( Storingvariable+100);

    }
}
