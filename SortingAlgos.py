class SortingAlgos: 
# Bubble Sorting 
    def bubbleSort(list):
        # looping thought the array

        for i in range(len(list)):
            for j in range(len(list) -1):
                # checking if the number is higher than the other

                if(list[ j ] > list[ j + 1 ]):

                    # swapping the higher with the lower
                    list[ j + 1], list[ j ] = list[ j ], list[ j + 1]

        #outputing the array
        for k in range(len(list)):
            print(list[k])

    list = [123,34,124,12345,123,5,1345,5,34,6,5,125,3,63,5,1345,346,5]
    # bubbleSort(list)



    # Selection sort
    def SelectionSort(list):

        # looping throught the array
            for i in range(len(list)):
                for j in range(i + 1, len(list)):
                    # checking witch number is higher 
                    if( list[i] > list[j] ):

                        #swapping then numbers
                        list[i], list[j] = list[j], list[i]

            # outputing the array
            for k in range(len(list)):
                print(list[k])

    list = [123,34,124,12345,123,5,1345,5,34,6,5,125,3,63,5,1345,346,5]  
    # SelectionSort(list)


    def insertionSort(list):
        for i in range(len(list)):
            key = list[ i ]
            j = i - 1

            while(j >= 0 and key < list[ j ]):
                list[ j + 1] = list[ j ]
                j -= j

            k = list[ j + 1]

        for k in range(len(list)):
                print(list[k])

    insertionSort(list)
    list = [123,34,124,12345,123,5,1345,5,34,6,5,125,3,63,5,1345,346,5]



                    











    


    





  