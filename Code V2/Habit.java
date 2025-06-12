/**This is a class for Habits */
public class Habit implements Item{
    private String habName;
    private int time;
    private int exp;
    private int diff;
    private Boolean status;

    public Boolean IsCompleted(){
        this.status=false;
        return this.status;
    }

    public Integer CalcExp(){
        if(this.diff==1){
            this.exp=1;
        }
        else if(this.diff==2){
            this.exp=2;
        }
        else if(this.diff==3){
            this.exp=3;
        }
        return exp;
    }

    public String toString(){
        return habName+time+diff;
    }
}