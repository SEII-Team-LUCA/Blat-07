package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.HashSet;
import java.util.Set;

public class Beobachtbar
{

    Set<Beobachter> _beobachter = new HashSet<Beobachter>();

    public void SetzeBeobachter(Beobachter b)
    {
        _beobachter.add(b);
    }

    public void meldeAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung();
        }
    }
}
