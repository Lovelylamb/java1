package extendPracise;

public class Kids extends Mankind{
    int yearOld;

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("yearOld:"+yearOld);
    }

    public static void main(String[] args) {
        Kids kids=new Kids();
        kids.sex=1;
        kids.yearOld=20;
        kids.salary=1;
        kids.printAge();
        kids.employeed();
        kids.manOrWomen();
    }

}
