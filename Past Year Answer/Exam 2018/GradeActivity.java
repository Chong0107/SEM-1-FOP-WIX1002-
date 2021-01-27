public class GradeActivity {
    protected int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public char getGrade(){
        if(score>=90)
            return 'A';
        else if(score>=80)
            return 'B';
        else if(score>=70)
            return 'C';
        else if(score>=60)
            return 'D';
        else
            return 'F';
    }

    public String toString(){
        String display;
        display = "\n"+"\nTotal score: "+score+"\nEssay grade: "+getGrade();
        return display;
    }
}
