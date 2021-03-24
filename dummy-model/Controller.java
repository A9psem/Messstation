
public class Controller 
{
    private Model model;
        
    public void setModel(Model m)
    {
        model = m;
    }
    public void aktualisieren(Messwert m)
    {
        model.einfuegen(m);
    }
    
    public void allesAusgeben()
    {
        model.allesAusgeben();
    }
       
}
