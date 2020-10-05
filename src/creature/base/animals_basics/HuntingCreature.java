package creature.base.animals_basics;

import creature.base.actions.Hunt;

import java.util.Scanner;

public class HuntingCreature extends Creature implements Hunt
{
    private int huntWill;
    private int huntSkill;

    public HuntingCreature()
    {
        this.huntWill = 0;
        this.huntSkill = 0;
    }
    @Override
    public void hunt()
    {
        if ((int) (Math.random() * 30 + 1) == 1) {
            System.out.println("amazing hunt!");
            this.huntWill += 50;
            this.huntSkill += 2;
            this.hungerNeed += 30;
        } else {
            System.out.println("that was not bad");
            this.huntSkill += 1;
            this.hungerNeed += 5;
        }
    }

    @Override
    public void learn() {
        System.out.println("your willing for hunt is precious");
        System.out.println("but don't forget about the value of other animals");
        System.out.println("try to learn more and hunt less");
        this.huntWill += 10;

    }

    @Override
    public void start(Scanner scanner)
    {
        System.out.println("ok, now here we go");
        System.out.println("1) hunt");
        System.out.println("2) learn");
        System.out.println("3) eat");
        System.out.println("4) evaluate");
        int input = scanner.nextInt();
        switch (input)
        {
            case 1: this.hunt();
            break;
            case 2: this.learn();
            break;
            case 3: this.eat();
            break;
            case 4: this.evaluate();
            break;
            default: start(scanner);
            break;
        }
    }

    @Override
    protected void evaluate()
    {
        if(this.huntWill > 50 && this.huntSkill > 10)
        {
            System.out.println("evaluation is ready, please wait");
            System.out.println("--------------------------------");

        }
    }

    @Override
    protected void eat() {
        System.out.println("you should hunt stuff to eat");
        this.start(new Scanner(System.in));
    }
}
