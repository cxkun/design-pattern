package com.cxkun.behavioral.template;

/**
 * 本例中模仿咖啡制作咖啡的过程
 */
public abstract class Coffee {
    public void addCoffee() {
        System.out.println("add coffee");
    }

    public void addSugar() {
        System.out.println("add sugar");
    }

    // 钩子
    public boolean isAddSugar() {
        return true;
    }

    public abstract void addMilk();

    public void make() {
        addCoffee();
        if (isAddSugar()) {
            addSugar();
        }
        addMilk();
    }
}
