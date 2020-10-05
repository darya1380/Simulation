package creature.intelligent;
import creature.base.actions.Fly;
import creature.base.actions.Think;
import creature.base.animals_basics.FlyingCreature;

import java.util.Scanner;

public class SpecialBird extends IntelligentStuff implements Fly, Think {
    @Override
    public void fly() {
        if ((int) (Math.random() * 2 + 1) == 1) {
            this.addSpeed();
            this.start(new Scanner(System.in));
        } else {
            System.out.println("you decided learning to fly");
            this.learn();
        }
    }

    @Override
    public void learn() {
        if ((int) (Math.random() * 10 + 3) == 6) {
            System.out.println("the fly learning is successful");
            this.addAI();
        } else {
            System.out.println("you didn't learn to fly yet");
        }
        this.start(new Scanner(System.in));

    }

    @Override
    public void think() {
        System.out.println("wow, here's the imagination world");
        System.out.println("it can lead to the great investments of love and AI");
        if ((int) (Math.random() * 2) == 1)
            this.addAI();
        else
            this.addLove();

    }


    @Override
    public void start(Scanner scanner) {
        System.out.println("hello, please select the task you wanna do");
        System.out.println("1) think");
        System.out.println("2) learn");
        System.out.println("3) fly");
        System.out.println("4) eat");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                this.think();
                break;
            case 2:
                this.learn();
                break;
            case 3:
                this.fly();
                break;
            case 4:
                this.eat();
                break;
            default:
                this.start(scanner);
                break;
        }
    }

    @Override
    protected void evaluate() {
        System.out.println("this is the last level!");
        this.start(new Scanner(System.in));
    }

    @Override
    protected void eat()
    {
        System.out.println("you don't have to eat");
        System.out.println("but now....");
        System.out.println("well nothing happens!");
        start(new Scanner(System.in));

    }
}
