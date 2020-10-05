package creature.base.animals_basics;

import creature.base.actions.Play;

public abstract class PlayingCreature extends Creature implements Play
{
    private int playWill;
    private int playSkill;
    public PlayingCreature()
    {
        this.playWill = 0;
        this.playSkill = 0;
    }
}
