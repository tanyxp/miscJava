package com.company;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class CircleCenter {
    public static String findCircleCenter(int[][] circleBitmap){
        Integer maxCountOfOnes = 0;
        Integer rowWithMostOnes = 0;
        Double xAvg = 0.0;
        Double yAvg = 0.0;

        //Count 1's in entire multi array
        Integer[] countOfOnesByRow = getListOfOnes(circleBitmap);

        //Find row with most 1's
        for(Integer i = 0; i < countOfOnesByRow.length; i++){
            if(countOfOnesByRow[i] > maxCountOfOnes) {
                maxCountOfOnes = countOfOnesByRow[i];
                rowWithMostOnes = i;
            }
        }

        //Get Y center value
        yAvg = getYAverage(countOfOnesByRow, maxCountOfOnes);

        //Get X center value
        xAvg = getXAverage(circleBitmap, rowWithMostOnes);

        return "The center of the circle is at: (" + xAvg.toString() + ", " + yAvg.toString() + ")";
    }

    public static Integer[] getListOfOnes(int[][] circleBitmap){
        Integer rows = circleBitmap.length;
        Integer cols = circleBitmap[0].length;
        Integer countOfOnes = 0;
        Integer[] countOfOnesByRow = new Integer[rows];

        for(Integer i = 0; i < rows; i++){
            for(Integer j = 0; j < cols; j++){
                if(circleBitmap[i][j] == 1)
                    countOfOnes++;
            }
            countOfOnesByRow[i] = countOfOnes;
            countOfOnes = 0;
        }
        return  countOfOnesByRow;
    }

    public static Double getYAverage(Integer[] countOfOnesByRow, Integer maxCountOfOnes){
        Double ySum = 0.0;
        Double yDivisor = 0.0;

        for(Integer i = 0; i < countOfOnesByRow.length; i++){
            if(countOfOnesByRow[i] == maxCountOfOnes){
                ySum += i;
                yDivisor++;
            }
        }
        return ySum / yDivisor;
    }

    public static Double getXAverage(int[][] circleBitmap, Integer rowWithMostOnes){
        Integer firstOne = null;
        Integer lastOne = null;
        for(Integer i = 0; i < circleBitmap[0].length; i++){
            if(firstOne == null && circleBitmap[rowWithMostOnes][i] == 1)
                firstOne = i;
            else if(firstOne != null && circleBitmap[rowWithMostOnes][i] == 1)
                lastOne = i;
        }
        return ((double)(firstOne + lastOne)/2);
    }
}
