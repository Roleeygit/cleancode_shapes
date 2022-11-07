public class Rectangle implements Shape{
    double aSide;
    double bSide;
    Double area;
    @Override

    public void calcArea() 
    {
        this.area = this.aSide * this.bSide;
    }

    @Override

    public boolean isGoodInput(String input) 
    {
        return new CheckInput().isGoodInput(input);
    }
}
