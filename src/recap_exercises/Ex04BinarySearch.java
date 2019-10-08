package recap_exercises;

public class Ex04BinarySearch {
    public static void main(String[] args) {
        int[] sortedArrayOfInts = {2, 4, 6, 7, 10, 18, 22, 49, 55, 108, 170, 200, 221, 223, 229, 240};
        System.out.println(returnIndexOfInt(sortedArrayOfInts, 223,0,sortedArrayOfInts.length));
    }

    private static int returnIndexOfInt(int[] sortedArrayOfInts, int searchedInt,int startIndex,int endIndex) {
        final int middleIndex = endIndex / 2;
        if((sortedArrayOfInts[startIndex] != searchedInt) && (sortedArrayOfInts[endIndex-1] != searchedInt) ){
            if(searchedInt < sortedArrayOfInts[middleIndex]){
                return returnIndexOfInt(sortedArrayOfInts,searchedInt,startIndex,middleIndex);
            }else{
                return returnIndexOfInt(sortedArrayOfInts,searchedInt,middleIndex,endIndex);
            }
        }else{
            if(sortedArrayOfInts[startIndex] == searchedInt){
                return startIndex;
            }
            return endIndex-1;
        }
    }
}
