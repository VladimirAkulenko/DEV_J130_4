/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j130_4_1;

/**
 *
 * @author USER
 */
public class Warehouse {
    private int amount;

    public synchronized void providerGoods(Provider prov, int amount, int loadTime){
        try {
            Thread.sleep(loadTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s хочет загрузить %d единиц товара. %n", prov.getName(),amount);
        this.amount += amount;
        notifyAll();

        System.out.printf("%s загрузил товар. Баланс сейчас в %d. %n", prov.getName(),this.amount);
    }

    public synchronized void consumerGoods(Consumer cons, int amount, int consumerTime){

        System.out.printf("%s хочет взять %d единиц товара. %n",cons.getName(),amount);
        while (amount> this.amount){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount -=amount;

        System.out.printf("%s взял товар. Баланс сейчас %d. %n", cons.getName(), this.amount);
    }
}
