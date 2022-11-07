public class Triangle implements Shape{
    double base;
    double height;
    Double area;
    @Override

    public void calcArea() 
    {
        this.area = this.base*this.height/2;
    }
    @Override

    public boolean isGoodInput(String input) 
    {
       //Névtelen példány
       return new CheckInput().isGoodInput(input);
    }
}
