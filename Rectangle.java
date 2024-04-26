public  class Rectangle extends Square {
    private int height =0;

    public Rectangle(int newWidth, int newheight){
        super(newWidth);
        setheight(newheight);
    }




    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setheight(int newheight) {
       height = newheight;
    }

   



}
