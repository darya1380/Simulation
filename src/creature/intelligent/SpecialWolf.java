package creature.intelligent;

import creature.base.actions.Hunt;

import java.util.Scanner;

public class SpecialWolf extends IntelligentStuff implements Hunt
{

    @Override
    public void start(Scanner scanner) {
        System.out.println("wow, as a special wolf you have the right to..");
        System.out.println("1) evaluate");
        System.out.println("2) eat");
        System.out.println("3) hunt");
        System.out.println("4) learn");
        int input = scanner.nextInt();
        switch (input)
        {
            case 1:
                this.evaluate();
                break;
            case 2:
                this.eat();
                break;
            case 3:
                this.hunt();
                break;
            case 4:
                this.learn();
                break;
            default: start(scanner);
        }
    }

    @Override
    protected void evaluate()
    {
        System.out.println("there is no creature to be evaluated to");
        start(new Scanner(System.in));

    }

    @Override
    protected void eat()
    {
        System.out.println("don't eat for energy");
        System.out.println("eat for intelligence and other things");
        start(new Scanner(System.in));
    }

    @Override
    public void hunt() {
        if ((int) (Math.random() * 2 + 1) == 1) {
            System.out.println("the hunting was successful");
            this.addSpeed();
        }
        else
            System.out.println("the hunting was not successful");
        start(new Scanner(System.in));
    }

    @Override
    public void learn()
    {
        System.out.println("you are so talented in hunting");
        System.out.println("you are great learner");
        System.out.println("and you have great passion to do it");
        this.addLove();
    }
}
