public class Picture
{
    private Square wall1, wall2, wall3;
    private Square wall4, wall5, wall6, wall7;
    private Square wall8, wall9, wall10, wall11;
    private Square wall12, wall13, wall14, wall15;
    private Square sky, ground;
    private Square window, window2, window3, window4, window5;
    private Triangle roof1, roof2, roof3, roof4, roof5, roof6;
    private Circle sun, doorknob;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ground = new Square();
        wall1 = new Square();
        wall2 = new Square();
        wall3 = new Square();
        wall4 = new Square();
        wall5 = new Square();
        wall6 = new Square();
        wall7 = new Square();
        wall8 = new Square();
        wall9 = new Square();
        wall10 = new Square();
        wall11 = new Square();
        wall12 = new Square();
        wall13 = new Square();
        wall14 = new Square();
        wall15 = new Square();
        window = new Square();
        window2 = new Square();
        window3 = new Square();
        window4 = new Square();
        window5 = new Square();
        roof1 = new Triangle();
        roof2 = new Triangle();
        roof3 = new Triangle();
        roof4 = new Triangle();
        roof5 = new Triangle();
        roof6 = new Triangle();
        sun = new Circle();
        doorknob = new Circle();
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
            sky.changeColor("sky blue");
            sky.moveHorizontal(-350);
            sky.moveVertical(-150);
            sky.changeSize(550);
            sky.makeVisible();

            ground.changeColor("green");
            ground.moveHorizontal(-350);
            ground.moveVertical(100);
            ground.changeSize(550);
            ground.makeVisible();

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

            wall5.changeColor("light blue");
            wall5.moveHorizontal(0);
            wall5.moveVertical(-30);
            wall5.changeSize(100);
            // wall5.makeVisible();

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

            roof3.changeColor("white");
            roof3.changeSize(50, 120);
            roof3.moveHorizontal(150);
            roof3.moveVertical(-10);
            roof3.makeVisible();

            roof4.changeColor("blue");
            roof4.changeSize(50, 120);
            roof4.moveHorizontal(150);
            roof4.moveVertical(0);
            roof4.makeVisible();

            roof5.changeColor("white");
            roof5.changeSize(80, 180);
            roof5.moveHorizontal(40);
            roof5.moveVertical(-100);
            roof5.makeVisible();

            roof6.changeColor("blue");
            roof6.changeSize(80, 180);
            roof6.moveHorizontal(40);
            roof6.moveVertical(-90);
            roof6.makeVisible();

            window.changeColor("white");
            window.moveHorizontal(-80);
            window.moveVertical(-10);
            window.changeSize(40);
            window.makeVisible();

            window2.changeColor("yellow");
            window2.moveHorizontal(-77);
            window2.moveVertical(-7);
            window2.changeSize(15);
            window2.makeVisible();

            window3.changeColor("yellow");
            window3.moveHorizontal(-58);
            window3.moveVertical(-7);
            window3.changeSize(15);
            window3.makeVisible();

            window4.changeColor("yellow");
            window4.moveHorizontal(-77);
            window4.moveVertical(12);
            window4.changeSize(15);
            window4.makeVisible();

            window5.changeColor("yellow");
            window5.moveHorizontal(-58);
            window5.moveVertical(12);
            window5.changeSize(15);
            window5.makeVisible();

            wall4.changeColor("light blue");
            wall4.moveHorizontal(10);
            wall4.moveVertical(60);
            wall4.changeSize(80);
            wall4.makeVisible();

            wall6.changeColor("light blue");
            wall6.moveHorizontal(-60);
            wall6.moveVertical(70);
            wall6.changeSize(70);
            wall6.makeVisible();

            wall7.changeColor("light blue");
            wall7.moveHorizontal(-130);
            wall7.moveVertical(70);
            wall7.changeSize(70);
            wall7.makeVisible();

            wall8.changeColor("light blue");
            wall8.moveHorizontal(-200);
            wall8.moveVertical(70);
            wall8.changeSize(70);
            wall8.makeVisible();

            wall9.changeColor("light blue");
            wall9.moveHorizontal(30);
            wall9.moveVertical(70);
            wall9.changeSize(70);
            wall9.makeVisible();

            wall10.changeColor("white");
            wall10.moveHorizontal(-120);
            wall10.moveVertical(80);
            wall10.changeSize(60);
            wall10.makeVisible();

            wall11.changeColor("white");
            wall11.moveHorizontal(-70);
            wall11.moveVertical(80);
            wall11.changeSize(60);
            wall11.makeVisible();

            wall12.changeColor("grey-blue");
            wall12.moveHorizontal(-110);
            wall12.moveVertical(90);
            wall12.changeSize(50);
            wall12.makeVisible();

            wall13.changeColor("grey-blue");
            wall13.moveHorizontal(-70);
            wall13.moveVertical(90);
            wall13.changeSize(50);
            wall13.makeVisible();

            wall14.changeColor("blue");
            wall14.moveHorizontal(35);
            wall14.moveVertical(110);
            wall14.changeSize(30);
            wall14.makeVisible();

            wall15.changeColor("blue");
            wall15.moveHorizontal(35);
            wall15.moveVertical(80);
            wall15.changeSize(30);
            wall15.makeVisible();

            doorknob.changeColor("yellow");
            doorknob.moveHorizontal(120);
            doorknob.moveVertical(140);
            doorknob.changeSize(5);
            doorknob.makeVisible();

            sun.changeColor("sun yellow");
            sun.moveHorizontal(200);
            sun.moveVertical(-80);
            sun.changeSize(30);
            sun.makeVisible();
            drawn = true;

            /* make person object!
             *
             */
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
