package org.example;

public class Risultato {

    private int goal1=0;
    private int goal2=0;

    public Risultato(int goal1, int goal2) {
        setGoal1(goal1);
        setGoal2(goal2);
    }
    public int getGoal2() {
        return goal2;
    }

    public void setGoal2(int goal2) {
        this.goal2 = goal2;
    }

    public int getGoal1() {
        return goal1;
    }

    public void setGoal1(int goal1) {
        this.goal1 = goal1;
    }

    @Override
    public String toString() {
        return "Risultato{" +
                "goal1=" + goal1 +
                ", goal2=" + goal2 +
                '}';
    }
}
