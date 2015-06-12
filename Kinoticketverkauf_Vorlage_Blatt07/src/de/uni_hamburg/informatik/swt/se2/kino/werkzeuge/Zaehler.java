package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

/**
 * Eine Beobachter-Klasse zum Testen,
 * ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung() funktionieren.
 * @author 4poehlma
 *
 */
public class Zaehler implements Beobachter
{

    private int _anzahlAufrufe;

    /**
     * Die Exemplarvariable wird initialisiert.
     */
    public Zaehler()
    {
        _anzahlAufrufe = 0;
    }

    /**
     * Der Beobachter reagiert auf eine Änderung, die ihm durch eine beobachtbare Klasse mitgeteilt wurde.
     * 
     * @param i ein int zur Differenzierung der aufrufenden Klasse
     */
    @Override
    public void reagiereAufAenderung(int i)
    {
//        if (i == 3)
//        {
            _anzahlAufrufe++;
//        }
    }

    /**
     * Eine Methode zur Rückgabe der Exemplarvariable.
     * 
     * @return die Anzahl der Aufrufe einer vollständigen informiereUeberAenderung() und reagiereAufAenderung() Schleife.
     */
    public int wieOftWurdestDuAufgerufen()
    {
        return _anzahlAufrufe;
    }
}
