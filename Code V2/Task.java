/**This is a class for tasks */
public class Task implements Item{
    private String taskName;
    private String deadline;
    private int exp;
    private int diff;
    private Boolean status;

    public Task(String name, String deadline, int exp, int difficulty, boolean status){
        this.taskName= name;
        this.deadline= deadline;
        this.exp= exp; 
        this.diff= difficulty;
        this.status= status;
    }

    public String getName(){
        return this.taskName;
    }

    public String getDeadline(){
        return this.deadline;
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
        return taskName+deadline+diff;
    }
}