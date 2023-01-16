package ru.job4j.polymorph;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle2 airplane = new Airplane();
        Vehicle2 train = new Train();
        Vehicle2 bus = new Bus();

        Vehicle2[] vehicle2 = new Vehicle2[]{airplane, train, bus};
        for (Vehicle2 v: vehicle2) {
            v.move();
            v.characteristics();
        }
    }
}
