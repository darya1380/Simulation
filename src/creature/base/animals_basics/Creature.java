package creature.base.animals_basics;

import java.util.Scanner;

public abstract class Creature
{
    private static int primaryId = 1000;
    private int id;
    protected int hungerNeed;
    protected boolean isAlive;

    public Creature()
    {
        primaryId++;
        this.id = primaryId;
        this.hungerNeed = 0;
        this.isAlive = true;
    }
    public int getId()
    {
        return this.id;
    }
    public void start(Scanner scanner)
    {

    }
    protected abstract void evaluate();
    protected abstract void eat();

    protected void setId(int id)
    {
        this.id = id;
    }
}
