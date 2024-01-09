public class Picture
{
    private Square wall1, wall2, wall3;
    private Square window;
    private Triangle roof1, roof2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall1 = new Square();
        wall2 = new Square();
        wall3 = new Square();
        window = new Square();
        roof1 = new Triangle();
        roof2 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall1.changeColor("blue");
            wall1.moveHorizontal(-200);
            wall1.moveVertical(-30);
            wall1.changeSize(100);
            wall1.makeVisible();

            wall2.changeColor("blue");
            wall2.moveHorizontal(-100);
            wall2.moveVertical(-30);
            wall2.changeSize(100);
            wall2.makeVisible();

            wall3.changeColor("blue");
            wall3.moveHorizontal(0);
            wall3.moveVertical(-30);
            wall3.changeSize(100);
            wall3.makeVisible();

            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();

            roof2.changeColor("blue");
            roof2.changeSize(100, 50);
            roof2.moveHorizontal(200);
            roof2.moveVertical(-50);
            roof2.makeVisible();

            roof1.changeColor("blue");
            roof1.changeSize(100, 50);
            roof1.moveHorizontal(-100);
            roof1.moveVertical(-50);
            roof1.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-60);
            sun.changeSize(30);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall1.changeColor("black");
        window.changeColor("white");
        roof1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall1.changeColor("red");
        window.changeColor("black");
        roof1.changeColor("green");
        sun.changeColor("yellow");
    }
}
