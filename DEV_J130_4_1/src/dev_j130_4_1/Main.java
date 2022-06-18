/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dev_j130_4_1;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
	Warehouse warehouse = new Warehouse();
    Entity [] entities = new Entity []{
            new Provider("Поставщик1", warehouse),
            new Provider("Поставщик2", warehouse),
            new Consumer("Клиент1", warehouse),
            new Consumer("Клиент2", warehouse),
            new Consumer("Клиент3", warehouse),
            new Consumer("Клиент4", warehouse),
    };
    for (Entity e: entities){
        e.start();
    }
    entities[0].join();

    }
    
}
