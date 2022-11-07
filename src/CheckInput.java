public class CheckInput {
    public boolean isGoodInput(String input) 
    {
        String sample = "[0-9]+";
        boolean isGoodInput = input.matches(sample);
        boolean good = true;

        if(isGoodInput) 
        {
            double num = Double.parseDouble(input);
            if(num<=0) 
            {
                good = false;
            }
        }else 
        {
            good = false;
        }
        return good;

    }
}
