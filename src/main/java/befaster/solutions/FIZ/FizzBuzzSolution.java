package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result;

        if(number%3 == 0 && number%5 != 0)
            result = "fizz";
        else if(number%3 != 0 && number%5 == 0)
            result = "buzz";
        else if(number%3 == 0 && number%5 == 0)
            result = "fizz buzz";
        else
            result = String.valueOf(number);

        return result;
    }

}

