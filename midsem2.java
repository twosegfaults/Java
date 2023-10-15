import java.util.*;
class Spaceship{
    private int foodOnBoard;
    private HashMap<String, Integer> crewMemberMap;
    private ArrayList<String> planetsVisited;
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
        Iterator ci = crewMemberMap.entrySet().iterator();
        int sum =0;
        while(ci.hasNext()){
            Map.Entry<String, Integer> temp= (Map.Entry)ci.next();
            sum+= temp.getValue();
        }
        if((sum*daysRequired)> foodOnBoard){
            return false;
        }
        else{
            planetsVisited.add(planetName);
            return true;
        }
    }


}
public class midsem2{
    public static void main(String args[]){

    }
}