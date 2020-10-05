package creature.base.animals_basics;

import creature.base.actions.Fly;
import creature.intelligent.SpecialBird;
import java.util.Scanner;

public class FlyingCreature extends Creature implements Fly
{
    private int flyWill;
    private int flySkill;
    public FlyingCreature()
    {
        flyWill = 0;
        flySkill = 0;
    }
    @Override
    public void fly()
    {
        switch ((int)(Math.random() * 10 + 1))
        {
            case 5:
            {
                System.out.println("amazing fly");
                this.flySkill += 5;
                this.flyWill  += 50;
            }
            break;

            case 7:
            {
                System.out.println("this fly was awful");
                System.out.println("the bird was badly damaged");
                if(this.flySkill < 2)
                {
                    System.out.println("your bird is dead!");
                    this.isAlive = false;
                }
            }
            break;
            default:
            {
                System.out.println("that was a fine short fly");
                this.flySkill += 1;
                this.flyWill += 25;
            }
            break;
        }

    }

    @Override
    public void learn() {
        switch ((int) (Math.random() * 2 + 1))
        {
            case 1:
            {
                System.out.println("your bird knows this lesson!");
                System.out.println("the fly skill is added");
                this.flySkill += 10;
                this.flyWill += 10;
            }
            break;
            case 2:
            {
                System.out.println("the bird needs more practice");
                this.flySkill -= 5;
            }
            break;
        }
    }

    @Override
    public void start(Scanner scanner) {
        System.out.println("1) eat");
        System.out.println("2) fly");
        System.out.println("3) learn to fly");
        System.out.println("4) evaluate");
        int input = scanner.nextInt();
        switch (input)
        {
            case 1: this.eat();
            break;
            case 2: this.fly();
            break;
            case 3: this.learn();
            break;
            case 4: this.evaluate();
            break;
            default:
                System.out.println("no item found");
                start(scanner);
        }
    }

    @Override
    protected void evaluate()
    {
        if(this.flySkill > 10 && this.flyWill > 100)
        {
            System.out.println("your bird is ready for evaluation");
            int id = this.getId();
            SpecialBird specialBird = new SpecialBird();
            specialBird.setId(id);
            specialBird.start(new Scanner(System.in));
        }
    }

    @Override
    protected void eat() {
        System.out.println("you can eat");
        this.hungerNeed += 20;
        start(new Scanner(System.in));
    }
}
