/**This is an interface for Tasks and habits */

public interface Item{
    public abstract Boolean IsCompleted();
    public abstract void CalcExp();
    public abstract String toString();
    public abstract String getName();
    public abstract Integer getExp();
}