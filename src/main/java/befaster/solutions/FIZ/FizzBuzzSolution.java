package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = String.valueOf(number);
        Boolean three = false, five = false, identical = true;
        Integer copy = number;
        int id = copy%10;
        int ok1 = 0, ok2 = 0;


        while(copy!=0){
            if(copy%10 != id)
                identical = false;
            if(copy%10 == 3)
                three = true;
            if(copy%10 == 5)
                five = true;
            copy = copy/10;
        }

        if((number%3 == 0 && number%5 != 0) || (three))
        {
            result = "fizz";
            ok1 = 1;
        }

        if((number%3 != 0 && number%5 == 0) || (five))
           {
               result = "buzz";
               ok2 = 1;
           }

        if((ok1 == 1 && ok2 == 1) || (number%3 == 0 && number%5 == 0))
            result = "fizz buzz";

        boolean bool = (number % 3 == 0 && three) || (number % 5 == 0 && five);

        if(bool && number%2 == 0)
            result = result + " deluxe";

        else if(bool && number%2 != 0)
            result = result + " fake deluxe";

        else if(result.equals(String.valueOf(number)) && bool && number %2 == 0)
            result = "deluxe";

        else if(result.equals(String.valueOf(number)) && bool && number %2 != 0)
            result = "fake deluxe";
        else
            return result;

        return result;
    }

}


