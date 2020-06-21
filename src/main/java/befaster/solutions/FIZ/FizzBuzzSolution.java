package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = String.valueOf(number);
        Boolean three = false, five = false;
        Integer copy = number;
        int ok = 0;

        while(copy!=0){
            if(copy%10 == 3)
                three = true;
            if(copy%10 == 5)
                five = true;
            copy = copy/10;
        }

        if((number%3 == 0 && number%5 != 0) || (three && number%5 != 0))
        {
            result = "fizz";
            ok += 1;
        }

        else if((number%3 != 0 && number%5 == 0) || (number%3 != 0 && five))
           {
               result = "buzz";
               ok += 1;
           }

        else if(ok == 2 || (number%3 == 0 && number%5 == 0))
            result = "fizz buzz";

        else
            result = String.valueOf(number);
        return result;
    }

}



