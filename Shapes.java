public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle yousif = new Turtle();
        for (int i=0; i<6;) {
           yousif.forward(50);
           yousif.left(60);
           i++;
        } 
           

        // Task 2: Draw a regular shape many times
        yousif.up();
        yousif.left(180);
        yousif.forward(250);
        yousif.left(180);
        yousif.down();
        for (int j=0; j<10;) {
           yousif.up();
           yousif.forward(25);
           yousif.down();
           j++;
           for (int i=0; i<6;) {
              yousif.forward(10);
              yousif.left(60);
              i++;
           }
        
           
          
           
        }

        // Task 3: How many times does Turtle turn!


        // Extension 1:


        // Extension 2:

    }
}
