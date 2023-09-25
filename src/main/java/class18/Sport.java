package class18;

public class Sport {
    private String name;
    private int numberofplayer;
    private String team;
    public Sport(String name,int numberofplayer,String team){
        this.name=name;
        this.numberofplayer=numberofplayer;
        this.team=team;
    }
    void info(){
        System.out.println(name+numberofplayer+team);
    }

}
class vollyball extends Sport{
    public vollyball(String name,int numberofplayer,String team){
        super(name,numberofplayer,team);
    }
}
class soccer extends Sport{
    public soccer(String name,int numberofplayer,String team) {
        super(name, numberofplayer, team);
    }}
class football extends Sport{
    public football(String name,int numberofplayer,String team) {
        super(name, numberofplayer, team);
    }}