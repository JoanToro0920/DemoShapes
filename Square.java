public  class Square  extends Shape{
    private int width=0;

    public Square(int newWidth){
      setWidth(newWidth);
      
    }


    

    public int getHeight() {
        return width;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth){
      width = newWidth;  
      
    }
    public void setheight(int newheight){
         
        width= newheight;
      }
    @Override
    public float getArea() {
      return getHeight()*getWidth();
    }
    @Override
    public float getPerimeter() {
      return 2*(getWidth()+getHeight());
    }
    
}
