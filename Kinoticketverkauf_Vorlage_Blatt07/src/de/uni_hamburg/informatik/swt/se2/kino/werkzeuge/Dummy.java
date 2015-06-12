package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

/**
 * Eine beobachtabare Klasse zum Testen,
 * ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung() funktionieren.
 * @author 4poehlma
 *
 */
public class Dummy extends Beobachtbar
{

    /**
     * 
     * @param b der Beobachter, der zur Liste hinzugefügt wird
     */
    public Dummy (Beobachter b)
    {
        setzeBeobachter(b);
    }
    
    /**
     * Sagt allen Beobachtern aus dem Set, dass was voll krasses passiert ist und sie sich das lieber mal anschauen sollten.
     */
    @Override
    public void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung(3);
        }
    }

}
