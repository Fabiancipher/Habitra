/**This is a class for Habits */
public class Habit implements Item{
    private String habName;
    private int time;
    private int exp;
    private int diff;
    private Boolean status;

    /**Constructor for habits
     * @param name: The name of the habit
     * @param time: Periodicy of the habit
     * @param difficulty: The difficulty of the habit
     * @param status: If the habit is completed or not
     */
    public Habit(String name, int time, int difficulty, boolean status){
        this.habName= name;
        this.time= time;
        this.diff= difficulty;
        this.status= status;
    }

    public String getName(){
        return this.habName;
    }

    public int getTime(){
        return this.time;
    }

    public int getExp(){
        return this.exp;
    }

    public int getDiff(){
        return this.diff;
    }

    public Boolean getStatus(){
        return this.status;
    }

    /**Checks if the habit is completed */
    public Boolean IsCompleted(){
        this.status=false;
        return this.status;
    }

    /**Calculates experience */
    public void CalcExp(){
        if(this.diff==1){
            this.exp=1;
        }
        else if(this.diff==2){
            this.exp=2;
        }
        else if(this.diff==3){
            this.exp=3;
        }
    }
    /**Returns habit data */
    public String toString(){
        return habName+time+diff;
    }
}