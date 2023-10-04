import java.security.SecureRandom;

public class LadderGame {
    public static void main(String[] args) {
        Dice d = new Dice();
        Player p1,p2;
        p1=new Player();
        p2=new Player();
        while(p1.count<100 && p2.count<100){
            p1.sumCount(d.die());
            if(p1.count>100){
                p1.count-=d.face;
            }
            p2.sumCount(d.die());
            if(p2.count>100){
                p2.count-=d.face;
            }
            p1.stepCount();
        }
        //To check if step counter is working is not
//        while(p1.count<100){
//            p1.sumCount(d.die());
//            if(p1.count>100){
//                p1.count-=d.face;
//            }
//            p1.stepCount();
//        }
//        while(p2.count<100){
//            p2.sumCount(d.die());
//            if(p2.count>100){
//                p2.count-=d.face;
//            }
//            p2.stepCount();
//        }

        System.out.println("p1 count="+p1.count);
        System.out.println("p2 count="+p2.count);
        System.out.println("No. of steps="+p1.step);
        if(p1.count==100)
            System.out.println("Player 1 wins!!");
        else
            System.out.println("Player 2 wins!!");
    }

}


class Player{
    int count;
    static int step;
    void sumCount(int p){
        count+=p;
    }
    void stepCount(){
        step++;
    }

}
class Dice{
    SecureRandom random = new SecureRandom();
    int face;
    int die(){
        face=1+random.nextInt(6);
        return face;
    }
}
