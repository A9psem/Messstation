import java.util.ArrayList;
public class Model
{
    
       ArrayList<Messwert> messreihe;

       public Model()
       {
           messreihe = new ArrayList<Messwert>();
    }
        
        public void einfuegen(Messwert messwert)
        {
            messreihe.add(messwert);
        }
        public void allesAusgeben()
        {
             for (int i = 0; i < messreihe.size(); i++)
             {
               messreihe.get(i).allesAusgeben();
             }
        }
            
} 
