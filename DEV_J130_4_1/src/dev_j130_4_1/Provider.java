/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_4_1;

/**
 *
 * @author USER
 */
public class Provider extends Entity{
    public Provider(String name, Warehouse warehouse) {
        super(name, warehouse);
    }

    @Override
    public void run() {
        while (true){
            warehouse.providerGoods(this, 5 + rnd.nextInt(15),random(100,500));
            pause(2000,3000);
        }
    }
}
