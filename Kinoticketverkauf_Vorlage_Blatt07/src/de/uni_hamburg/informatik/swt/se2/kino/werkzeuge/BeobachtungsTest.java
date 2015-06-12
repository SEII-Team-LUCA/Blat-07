package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Testet, ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung() funktionieren.
 * 
 * @author 4poehlma
 *
 */
public class BeobachtungsTest
{

    //Die Benötigten Objekte
    private Zaehler _zaehler;
    private Dummy _dummy;

    /**
     * Initialisiert diese Objekte, um im weiteren Verlauf mit ihnen arbeiten zu können.
     */
    public BeobachtungsTest()
    {
        _zaehler = new Zaehler();
        _dummy = new Dummy(_zaehler);
    }

    /**
     * Testet, ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung() für 3 Aufrufe funktionieren.
     */
    @Test
    public void TesteAnzahlAufrufe3()
    {
        _dummy.informiereUeberAenderung();
        _dummy.informiereUeberAenderung();
        _dummy.informiereUeberAenderung();

        assertEquals(_zaehler.wieOftWurdestDuAufgerufen(), 3);
    }
    
    /**
     * Testet, ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung()
     * für eine beliebige Anzahl an Aufrufen funktionieren.
     */
    @Test
    public void TesteAnzahlAufrufe0()
    {
        assertEquals(_zaehler.wieOftWurdestDuAufgerufen(), 0);
    }

    /**
     * Testet, ob unser Aufruf der Methoden informiereUeberAenderung() und reagiereAufAenderung() auch funktionieren,
     * wenn sie noch nicht aAufgerufen wurden.
     */
    @Test
    public void TesteAnzahlAufrufeRandom()
    {
        int random = (int)(Math.random()*1000);
        for (int i = random; i>0; i--)
        {
            _dummy.informiereUeberAenderung();
        }

        assertEquals(_zaehler.wieOftWurdestDuAufgerufen(), random);
    }
}
