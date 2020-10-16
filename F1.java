import java.util.*;

public class F1
{

    static String[] driverLineup = {"Lewis Hamilton ---------- Mercedes AMG","Valtteri Bottas ---------- Mercedes AMG","Max Verstappen ---------- Red Bull Racing",
            "Alex Albon ---------- Red Bull Racing","Sebastian Vettel ---------- Ferrari","Charles Leclerc ---------- Ferrari","Lando Norris ---------- Mclaren",
            "Carlos Sainz ---------- Mclaren","Daniel Ricciardo ---------- Renault", "Esteban Ocon ---------- Renault","Lance Stroll ---------- Racing Point",
            "Sergio Perez ---------- Racing Point","Pierre Gasly ---------- AlphaTauri","Daniil Kvyat ---------- AlphaTauri","Kimi Räikkönen ---------- Alfa Romeo Racing",
            "Antonio Giovinazzi ---------- Alfa Romeo Racing","Kevin Magnussen ---------- Haas F1 Team","Romain Grosjean ---------- Haas F1 Team","George Russel ---------- Williams",
            "Nicholas Latifi ---------- Williams"};

    // random factor that determines DNFs

    public static void main(String[] args)
    {
        String[] tracks = {"Red Bull Ring, Austria","Silverstone, Great Britain","Monza, Italy","Spa, Belgium","Sochi, Russia",
                "Monaco Circuit, Monaco","Shanghai, China","Marina Circuit, Abu Dhabi"};
        String rndtrack = tracks[(int)(Math.random()*tracks.length)];
        ArrayList<String> raceResult = new ArrayList<>();
        for(int i = 0; i < 20; i++)
        {
            raceResult.add(driverLineup[i]);
        }
        Collections.shuffle(raceResult);
        System.out.println("The race results after the " + rndtrack + " Grand Prix are as follows:\n");
        for(int j = 0;j < 20; j++)
        {
            System.out.println(j + 1 + ". " + raceResult.get(j));
        }
    }
}