// ===========================================================
// PROBLEM 1 -- Multiples of 3 and 5
// ===========================================================
//
// If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6, and 9. The sum of
// these multiples is 23.
//
// Find the sum of all multiples of 3 or 5 below 1000
//
// ===========================================================

public class Euler
{
    // === PROBLEM 1 ATTRIBUTES === //
    private int prob1Multiple1  =  3;      // Multiples of *3* and 5
    private int prob1Multiple2  =  5;      // Multiples of 3 and *5*
    private int prob1Maximum    =  1000;   // Analyzing values under 1000
    private int prob1Solution   =  0;      // Will Hold the solution

    // === CONSTRUCTOR === //
    public Euler( ){ /* Empty Constructor */ }

    // === PROBLEM 1 -- MULTIPLES OF 3 AND 5 === //

    // **********************************************************
    // PUBLIC METHOD: printProblem1Context
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:   Display the title of the problem on a single line
    //
    // **********************************************************
    public void printProblem1Context( )
    {
        System.out.printf("Project Euler Problem 1 -- Multiples of 3 and 5%n");
    }

    // **********************************************************
    // PUBLIC METHOD: printProblem1Solution
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:
    //      -   Calculate the Solution (if none exists already)
    //      -   Print the solution to the console with formatting
    //
    // **********************************************************
    public void printProblem1Solution( )
    {
        if ( prob1Solution == 0 )
        {
            this.problem1( );
        }
        System.out.printf("Solution:\t%d%n", prob1Solution);
    }

    // **********************************************************
    // PRIVATE METHOD: problem1
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:
    //      -   Compute the results of project Euler Problem 1
    //      -   Store the value of the results in the private
    //          attribute problem1Solution
    //
    // **********************************************************
    private void problem1(  )
    {
        this.prob1Solution  =  0;
        for ( int n = 1 ; n < prob1Maximum ; ++n )
        {
            if ( n % prob1Multiple1 == 0 || n % prob1Multiple2 == 0 )
            {
                this.prob1Solution += n;
            }
        }
    }
}
