import java.util.*;
class Spaceship{
    private int foodOnBoard;
    private HashMap<String, Integer> crewMemberMap= new HashMap<String, Integer>();
    private ArrayList<String> planetsVisited= new ArrayList<String>();
    public Spaceship(int food){
        this.foodOnBoard=food;
    }
    public void board(String crewMemberName, int foodPerDay){
        crewMemberMap.put(crewMemberName, foodPerDay);
    }
    public void unboard(String crewMemberName){
        crewMemberMap.remove(crewMemberName);
    }
    public String getPlanetsVisited(){
        return planetsVisited.toString();
    }
    public boolean flyTo(String planetName, int daysRequired){
        Iterator<Map.Entry<String, Integer>> ci = crewMemberMap.entrySet().iterator();
        int sum =0;
        while(ci.hasNext()){
            Map.Entry<String, Integer> temp= (Map.Entry<String, Integer>)ci.next();
            sum+= temp.getValue();
        }
        if((sum*daysRequired)> foodOnBoard){
            return false;
        }
        else{
            planetsVisited.add(planetName);
            foodOnBoard-=sum;
            return true;
        }
    }
    public ArrayList<String> visitablePlanets(int startingFood, HashMap<String, Integer> crewMap, HashMap<String, Integer> planetMap){
        Spaceship s = new Spaceship(startingFood);
        s.crewMemberMap = new HashMap<String, Integer>(crewMap);
        Iterator<Map.Entry<String, Integer>> pi = planetMap.entrySet().iterator();
        while(pi.hasNext()){
            Map.Entry<String, Integer> temp = (Map.Entry<String, Integer>)pi.next();
            s.flyTo(temp.getKey(), temp.getValue());
        }
        return s.planetsVisited;
    }

}
public class midsem2{
    public static void main(String args[]){
        Spaceship s1 = new Spaceship(50);
        s1.board("Nolan", 3);
        s1.board("Nick", 4);
        boolean Ven = s1.flyTo("Venus", 7);
        boolean Mar1 = s1.flyTo("Mars", 10);
        System.out.println("Travel to Venus? "+ Ven);
        System.out.println("Travel to Mars? "+ Mar1);
        s1.unboard("Nolan");
        System.out.println("The planets visited by s1 are "+ s1.getPlanetsVisited());
        HashMap<String, Integer> crew= new HashMap<String, Integer>();
        crew.put("Rishi", 2);
        crew.put("Guy", 2);
        crew.put("Aleksander", 3);
        HashMap<String, Integer> planets = new HashMap<String, Integer>();
        planets.put("Venus", 2);
        planets.put("Mars", 3);
        planets.put("Saturn", 10);
        ArrayList<String> ans = s1.visitablePlanets(50, crew, planets);
        System.out.println("The planets visited by s are"+ ans.toString());
    }
}
