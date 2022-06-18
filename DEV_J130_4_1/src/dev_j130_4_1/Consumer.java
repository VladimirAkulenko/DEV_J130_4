/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_4_1;

/**
 *
 * @author USER
 */
public class Consumer extends Entity{
    public Consumer(String name, Warehouse warehouse) {
        super(name, warehouse);
    }

    @Override
    public void run() {
        while (true){
            pause(1000,2000);
            warehouse.consumerGoods(this,5+rnd.nextInt(14),random(200,300));

        }
    }
}
