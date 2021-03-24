public class Messwert
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int temperatur;
    private int luftfeuchtigkeit;
    //private String einheit;
    private String zeit;
    private String datum;
    
    public Messwert(String zeit_, String datum_, int temperatur_, int luftfeuchtigkeit_)
    {
        datum = datum_;
        zeit = zeit_;
        luftfeuchtigkeit = luftfeuchtigkeit_;
        temperatur = temperatur_;
    }
    
    public void allesAusgeben()
    {
        System.out.println("Zeit: "+zeit+"  Datum: "+datum+" Temperatur: "+temperatur+" luftfeuchtigkeit: "+luftfeuchtigkeit);
    }
}
