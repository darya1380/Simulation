package creature.intelligent;

import creature.base.animals_basics.Creature;

import java.util.Scanner;

public abstract class IntelligentStuff extends Creature
{
    private int arterialIntelligence;
    private int speed;

    public int getArterialIntelligence()
    {
        return arterialIntelligence;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getLove()
    {
        return love;
    }

    private int love;
    public IntelligentStuff()
    {
        this.speed = 0;
        this.love = 0;
        this.arterialIntelligence = 0;
    }
    protected void addSpeed()
    {
        if ((int) (Math.random() * 5 + 1) == 2) {
            System.out.println("the speed of your creature is increased");
            System.out.println("it helps it to evaluate into higher levels");
            this.speed += 100;
        } else {
            System.out.println("the speed of your creature decreased!");
            this.speed -= 20;
        }
    }
    protected void addLove()
    {
        if((int)(Math.random() * 10 + 1) == 1 || (int)(Math.random() * 3 + 1) == 2 )
        {
            System.out.println("the AI love is increased");
            this.love += 100;
        }
        else
        {
            System.out.println("the AI love is decreased");
            this.love -= 50;
        }
    }
    protected void addAI()
    {
        if((int)(Math.random() * 3) == 0)
        {
            System.out.println("the AI is increased!");
            this.arterialIntelligence += 200;
        }
        else
        {
            System.out.println("AI is important for you! isn't it?");
            this.arterialIntelligence -= 50;
        }
    }
}
