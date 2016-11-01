package misc;

import java.math.BigInteger;

import cp120.assignments.assignment003.Numbers;

public class NumbersTest
{
    public static void main( String[] args )
    {
        isPrime();
        newLine();
        lcm();
        newLine();
        gcf();
        newLine();
        digitSum();
        newLine();
        mean();
        newLine();
        median();
        newLine();
        factorial();
        newLine();
        factorialP();
    }
    
    private static void newLine()
    {
        System.out.println();
    }
    
    private static void isPrime()
    {
        int[]   pArr    = { 0, 1, 2, 3, 4, 5, 7, 9, 11, 13, 14, 15, 17, 19 };
        for ( int num : pArr )
            isPrime( num );
    }

    private static void isPrime( int num )
    {
        boolean result  = Numbers.isPrime( num );
        System.out.printf( "isPrime( %3d ): %b\n", num, result );
    }
    
    private static void lcm()
    {
        int[][] arr =
        {
            { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 }, { 2, 2 }, { 2, 3 },
            { 3, 3 }, { 2, 4 }, { 2, 6 }, { 2, 8 }, { 3, 5 }, { 3, 7 }, 
            { 5, 7 }, { 5, 13 },
            { 210, 16 }, { 125, 55 }, { 70, 34 }, { 21, 18 }
            //  1680         1375        1190        126
        };
        
        for ( int[] pair : arr )
            lcm( pair[0], pair[1] );
    }

    private static void lcm( int num1, int num2 )
    {
        int result  = Numbers.lcm( num1, num2 );
        System.out.printf( "lcm( %3d, %3d ): %4d\n", num1, num2, result );
    }
    
    private static void gcf()
    {
        int[][] arr =
        {
            { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 }, { 2, 2 }, { 2, 3 },
            { 3, 3 }, { 2, 4 }, { 2, 6 }, { 2, 8 }, { 3, 5 }, { 3, 7 },
            { 5, 7 }, { 5, 13 },
            { 210, 16 }, { 125, 55 }, { 70, 34 }, { 21, 18 }
            //  1680         1375        1190        126
        };
        
        for ( int[] pair : arr )
            gcf( pair[0], pair[1] );
    }

    private static void gcf( int num1, int num2 )
    {
        int result  = Numbers.gcf( num1, num2 );
        System.out.printf( "gcf( %3d, %3d ): %d\n", num1, num2, result );
    }
    
    private static void digitSum()
    {
        int[]   nums    =
        { 0, 1, 2, 10, 11, 12, 21, 101, 111, 121, 543,
          1975, 945710
        };
        
        for ( int num : nums )
            digitSum( num );
    }
    
    private static void digitSum( int num )
    {
        int sum = Numbers.digitSum( num );
        System.out.printf( "digitSum( %6d ): %2d\n", num, sum );        
    }
    
    private static void mean()
    {
        double[]    arr1    = { -1 }; // -1
        double[]    arr2    = { -2, 2 }; // 0
        double[]    arr3    = { -.1, -.3, -.2 }; // -.2
        double[]    arr4    = { 1, .5, -2.2, -.3, .5, -.4, 3.2 }; // 0.3286
        double[][]  allArrs = { arr1, arr2, arr3, arr4 };
        
        for ( double[] arr : allArrs )
            mean( arr );
    }
    
    private static void mean( double[] arr )
    {
        double          mean    = Numbers.mean( arr );
        String          strMean = String.format( "%5.4f", mean );
        StringBuilder   bldr    = new StringBuilder( "mean( " );
        bldr.append( arr[0] );
        for ( int inx = 0 ; inx < arr.length ; ++inx )
            bldr.append( ", " ).append( arr[inx] );
        bldr.append( " ): " ).append( strMean );
        System.out.println( bldr );
    }
    
    private static void median()
    {
        double[]    arr1    = { -1 }; // -1
        double[]    arr2    = { -2, 2 }; // 0
        double[]    arr3    = { -.1, -.3, -.2 }; // -.2
        double[]    arr4    = { -.5, .3, -.12, .6, -.8, 22 }; // .09
        double[]    arr5    = { 1, .5, -2.2, -.3, .5, -.4, 3.2 }; // 0.3286
        double[][]  allArrs = { arr1, arr2, arr3, arr4, arr5 };
        
        for ( double[] arr : allArrs )
            median( arr );
    }
    
    private static void median( double[] arr )
    {
        double          median      = Numbers.median( arr );
        String          strMedian   = String.format( "%5.4f", median );
        StringBuilder   bldr    = new StringBuilder( "median( " );
        bldr.append( arr[0] );
        for ( int inx = 1 ; inx < arr.length ; ++inx )
            bldr.append( ", " ).append( arr[inx] );
        bldr.append( " ): " ).append( strMedian );
        System.out.println( bldr );
    }
//    
    private static void factorial()
    {
        int[]   nums    =
            {   0,   1,   2,   3,   5,   
           //   1    1    2    6    120
                10,     20,     31 };
           //   3,628,800
           //           2,432,902,008,176,640,000
           //                   8,222,838,654,177,922,817,725,562,880,000,000                                    
          for ( int num : nums )
              factorial( num );
    }
    
    private static void factorial( int num )
    {
        BigInteger  factorial   = Numbers.factorial( num );
        System.out.printf( "factorial( %2d ): %,d\n", num, factorial );
    }
    
    private static void factorialP()
    {
        int[]   nums    =
            {   0,   1,   2,   3,   5,   
           //   1    1    2    6    120
                10,     20,     31 };
           //   3,628,800
           //           2,432,902,008,176,640,000
           //                   8,222,838,654,177,922,817,725,562,880,000,000                                    
          for ( int num : nums )
          {
              BigInteger    bigNum  = BigInteger.valueOf( num );
              factorial( bigNum );
          }
    }
    
    private static void factorial( BigInteger num )
    {
        BigInteger  factorial   = Numbers.factorial( num );
        System.out.printf( "factorial'( %2d ): %,d\n", num, factorial );
    }
}
