package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.HashSet;
import java.util.Set;

/**
 * Setzt eine Klasse, die von dieser Klasse erbt, als Beobachtbar.
 * Eine Beobachtbare Klasse merkt sich alle Klassen, die sich als Beobachter registriert haben
 * und kann diese über wichtige Änderungen informieren, auf die der Beobachter nun reagieren kann.
 * 
 * @author 4poehlma
 *
 */
public abstract class Beobachtbar
{

    /**
     * Ein Set aller Beobachter, die sich bei dieser Klasse registriert haben.
     */
    protected Set<Beobachter> _beobachter = new HashSet<Beobachter>();

    /**
     * Eine Methode, um einen Beobachter zum Set hinzuzufügen.
     * 
     * @param b Der Beobachter
     */
    public void setzeBeobachter(Beobachter b)
    {
        _beobachter.add(b);
    }

    /**
     * Sagt allen Beobachtern aus dem Set, dass was voll krasses passiert ist und sie sich das lieber mal anschauen sollten.
     */
    public abstract void informiereUeberAenderung();
}
