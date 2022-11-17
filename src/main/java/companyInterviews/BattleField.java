package companyInterviews;

import java.util.*;
import java.util.stream.Collectors;

class Coordinate{
    int x,y;
    Coordinate(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class BattleField {
    private final String PLAYER_A="PlayerA";
    private final String PLAYER_B="PlayerB";
    private final String MISS="Miss";
    private final String HIT ="Hit";

    String[][] grid;
    int n;
    Set<String> playerABattleShips=new HashSet<>();
    Set<String> playerBBattleShips=new HashSet<>();
    Random random = new Random();

    public void initGame(int n){
        this.n=n;
        grid=new String[n][n];
    }

    public String addShip(String id, int size, int xA, int yA, int xB, int yB){
        int before=size/2;
        int after=size%2==0?size/2-1:size/2;
        if(!isValidPosition(before, after, xA, xB, yA, yB)){
            return "Invalid Position";
        }
        landShip("A"+"-"+id, xA-before, yA-before, xA+after, yA+after);
        playerABattleShips.add("A"+"-"+id);
        landShip("B"+"-"+id, xB-before, yB-before, xB+after, yB+after);
        playerBBattleShips.add("B"+"-"+id);
        return "Ships are landed Successfully";
    }

    boolean isValidPosition(int before, int after, int xA, int yA, int xB, int yB){
        return (xA-before>=0) && (xA+after<n/2)
                && (yA-before>=0) && (yA+after<n)
                && isEmptySpace(xA-before, yA-before, xA+after, yA+after)
                && (xB-before>=n/2) && (xB+after<n)
                && (yB-before>=0) && (yB+after<n)
                && isEmptySpace(xB-before, yB-before, xB+after, yB+after);
    }
    public boolean isEmptySpace(int x1, int y1, int x2, int y2){
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                if(grid[i][j]!=null || (grid[i][j]!=null && grid[i][j].trim()!="")){
                    return false;
                }
            }
        }
        return true;
    }

    public void landShip(String name, int x1, int y1, int x2, int y2){
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                grid[i][j]=name;
            }
        }
    }

    public void startGame(){
        boolean playerATurn=true;
        while(playerABattleShips.size()>0 && playerBBattleShips.size()>0) {
            Coordinate coordinate=getNewCoordinate(playerATurn);
            int i=coordinate.x;
            int j=coordinate.y;
            if(grid[i][j]==null){
                //Miss
                grid[i][j]=MISS;
                playerATurn=!playerATurn;
                System.out.println(getMissString(playerATurn, i, j));
                continue;
            }else{
                //Hit
                String shipName= grid[i][j];
                grid[i][j]=HIT;
                if(playerATurn)
                    playerBBattleShips.remove(shipName);
                else
                    playerABattleShips.remove(shipName);
                clear(shipName);
                System.out.println(getHitString(playerATurn, i, j, shipName.substring(2)));
            }
        }
        System.out.println(getRemainingShipString());
        System.out.println(getGameOverString(playerATurn));
    }

    public Coordinate getNewCoordinate(boolean isPlayerATurn){
        int i,j;
        do{
            i= random.nextInt(n/2 - 1) + (isPlayerATurn?n/2:0);
            j = random.nextInt(n - 1);
        }while(grid[i][j]!=null && (grid[i][j].equals(MISS)||grid[i][j].equals(HIT)));
        return new Coordinate(i,j);
    }

    public void clear(String shipName){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=null && grid[i][j].equals(shipName)){
                    grid[i][j]=null;
                }
            }
        }
    }

    public void viewBattleField(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+"  ");
            }
            System.out.println();
        }
    }

    String getMissString(boolean isPlayerATurn, int x, int y){
        return (isPlayerATurn?PLAYER_A:PLAYER_B)+"’s turn: Missile fired at ("+x+", "+y+"). \""+MISS+"\"";
    }

    String getHitString(boolean isPlayerATurn, int x, int y, String shipId){
        return (isPlayerATurn?PLAYER_A:PLAYER_B)+"’s turn: Missile fired at ("+x+", "+y+"). \""+ HIT +"\". "
                +(isPlayerATurn?PLAYER_B:PLAYER_A)+"’s ship with id \""+shipId+"\" destroyed.";
    }

    String getRemainingShipString(){
        return "Ships Remaining - PlayerA:"+playerABattleShips.size()+", PlayerB:"+playerBBattleShips.size();
    }

    String getGameOverString(boolean isPlayerATurn){
        return "GameOver. "+(isPlayerATurn?PLAYER_A:PLAYER_B)+" wins";
    }

    public static void main(String[] args) {
//        BattleField battleField=new BattleField();
//        battleField.initGame(6);
//        battleField.addShip("SH-1", 2, 1,5,4,4);
//        battleField.viewBattleField();
//        battleField.startGame();
//        battleField.viewBattleField();
//        System.out.println(1.0/0.0);

        List<Integer> a=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        map.putIfAbsent(0,0);
    }

    public List<String> removeAnagrams(List<String> words){
        List<String> result=new ArrayList<>();
        Set<String> anagramsSet=new HashSet<>();
        TreeSet<String> sortedList=new TreeSet();
        sortedList.addAll(words);

        for (String word:sortedList){
            String sortedWord=sortWord(word);
            if(!anagramsSet.contains(sortedWord)){
                anagramsSet.add(sortedWord);
                result.add(word);
            }
        }
        return result;

    }

    public String sortWord(String word){
        char[] wordArray=word.toCharArray();
        Arrays.sort(wordArray);
        return  new String(wordArray);
    }

//    public static int findMinDays(int n, int m){
//        if(n==m){
//            return 0;
//        }
//        if(n<)
//    }
}
