package Day_3;

public class UC1_LineDistance {

	 public void CalDistance(int x1,int y1,int x2,int y2) {
         double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
         System.out.println("Distance: "+distance);
 }
 public static void main(String[] args) {
         // TODO Auto-generated method stub
 	UC1_LineDistance lc = new UC1_LineDistance();
         lc.CalDistance(1, 1, 5, 4);
 }
}
