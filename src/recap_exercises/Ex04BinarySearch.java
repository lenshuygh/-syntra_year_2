package recap_exercises;

public class Ex04BinarySearch {
    public static void main(String[] args) {
        int[] sortedArrayOfInts = {2, 4, 6, 7, 10, 18, 22, 49, 55, 108, 170, 200, 221, 223, 229, 240};
        System.out.println(returnIndexOfInt(sortedArrayOfInts, 10, 0, sortedArrayOfInts.length));
    }

    private static int returnIndexOfInt(int[] sortedArrayOfInts, int searchedInt, int startIndex, int endIndex) {
        int middleIndex = endIndex / 2;
        while (startIndex + 1 != endIndex) {
            if (searchedInt < sortedArrayOfInts[middleIndex]) {
                endIndex = middleIndex;
                middleIndex = endIndex / 2;
            } else {
                startIndex = middleIndex;
                middleIndex = middleIndex + ((endIndex - middleIndex) / 2);
            }
            if(sortedArrayOfInts[middleIndex] == searchedInt){
                return middleIndex;
            }
        }
        return -1;
    }
}
