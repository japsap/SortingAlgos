public class SortingAlgos {
    public static void main(String[] args) {

        int[] sortList = {123,42,34,3452,36,245,14,513,6,246,245,62,56,347,245,624,56,45,3,61,456};

        // BubbleSort(sortList);
        // SelectionSort(sortList);
        MergeSort(sortList);

        for(int k = 0;k < sortList.length; k++){
            System.out.println(sortList[k]);
        }
        
    }

    public static void BubbleSort(int[] list){

        // integers
        int size = list.length;

        // nested loop
        for(int i = 0; i < size; i++){ 
            for(int j = 0; j < size -1; j++){
                if(list[ j ] > list[ j + 1 ]){
                    // swap the higher with the lower
                    int temp = list[j];
                    list[j] = list[ j+1 ];
                    list[ j+1 ] = temp;
                }
            }   
        }  
    }

    public static void SelectionSort(int[] list) {

        
        // integers
        
        int size = list.length;

        // looping thought the array
        for(int i = 0; i < size; i++){
            for( int j = i + 1; j < size; j++){

                // chehcking witch nubmber is the lowest
                if(list[i] > list[j]){

                    // swapping the the found minimum element with the first
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    
        //finding the higest number in the array
        // for(int j = 0; j < size; j++){
        //     if(list[j] > max){
        //         max = list[j];
        //     }
        // }

        //finding the lowest number in the array
        // for(int j = 0; j < size; j++){
        //     if(list[j] < max){
        //         max = list[j];
        //     }
        // }

    }    

    public static void MergeSort(int[] list) {

        int size = list.length;
        // looping thought the array
        for(int i = 0; i < size; i++){

            // asigning the key
            int k = list[ i ];
            int j = i - 1;

            // comparing the key to the elements until the element is smaller than the it found
            while( j >= 0 && k < list[ j ]){
                list[ j + 1 ] = list[ j ];
                --j;
            }

            // giving the key to the element that is smaller than the key
            list[ j + 1 ] = k;

        }
    }
}   