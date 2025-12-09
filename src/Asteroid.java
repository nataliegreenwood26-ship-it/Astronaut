public class Asteroid {
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.


    public Asteroid(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx = 2;
        dy = -5;
        width = 85;
        height = 85;
        isAlive = true;

    } // constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {
        if(xpos>=1000) { //wrap when hits right wall
            xpos = 0-width;

        }
        if(xpos<=0){
            xpos = 999-width;
        }

        //todo: maked it wrap when hit the top and bottom
    if(ypos<=0) {//wrap when hits the top wall
    ypos = 699;
    }

    if(ypos>=700) {
        ypos = 1;
    }

    xpos = xpos +dx;
    ypos = ypos + dy;

    }



}








