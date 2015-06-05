package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.HashSet;
import java.util.Set;

public abstract class Beobachtbar
{

    protected Set<Beobachter> _beobachter = new HashSet<Beobachter>();

    public void setzeBeobachter(Beobachter b)
    {
        _beobachter.add(b);
    }

    public abstract void informiereUeberAenderung();
}
