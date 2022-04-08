## Data Structures Individual Final - Rohan N

## Per Week Challenges Code

| Week | Code |
| ----- | ----- |
|     0 | [Link(intbyref and matrix)](https://github.com/macddmac/rohan_indi_repo/tree/main/src/com/rohanchallenges/ds) |
|     1 | [Link(linked lists/queues)](https://github.com/macddmac/rohan_indi_repo/tree/main/src/com/rohanchallenges/ll) |
|     2 | [Link(calculator)](https://github.com/macddmac/rohan_indi_repo/tree/main/src/com/rohanchallenges/calc) |
|     3 | [Link(sorts)](https://github.com/macddmac/rohan_indi_repo/tree/main/src/com/rohanchallenges/sorts) |

## [Repl Runtime](https://replit.com/@rohannallap/rohanindirepo#run.sh) 
### Repl Instructions 
- Run the .sh file in order to see the menu
- Choose an option from the menu and you are good to go

## Week 0 Key Learnings 
### Console Menu
```java
    public static void menu() {


        int selection;  //user selection variable of type Integer

        //Using a Class: AP CSA Unit 2
        //Scanner is well known Java class for text based input
        Scanner scan = new Scanner(System.in);  //defining an object to scan/get input from user, notice the use of "new", this means you are making an object of type Scanner.

        //System.out.println -  A Class or Static method call that is used to output a message to the terminal.
        //The block of outputs below is used to present a menu to the user.
        System.out.println("-------------------------\n");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - IntByReference");
        System.out.println("2 - Matrix");
        System.out.println("3 - Calculator");
        System.out.println("4 - Sorts");
        System.out.println("0 - Quit");

        //Using Scanner Class to get integer as input
        selection = scan.nextInt();  //Using nextInt() method to get an integer value



        switch (selection) {
            case 0:
                return;
            case 1:
                System.out.println("Choose 1st number:");
                int n1 = scan.nextInt();
                System.out.println("Choose 2nd number:");
                int n2 = scan.nextInt();
                IntByReference.swapper(n1, n2);
                break;
            case 2:
                Matrix m0 = new Matrix(Matrix.keypad());
                System.out.println("Keypad:");
                System.out.println(m0);

                Matrix m1 = new Matrix(Matrix.numbers());
                System.out.println("Numbers Systems:");
                System.out.println(m1);
                break;
            case 3:
                ArrayStackDemo result = new ArrayStackDemo();
                System.out.print(result);
                break;
            case 4:
                break;
            default:
                System.out.println("Unexpected choice, try again.");
        }
        menu();


    }
```
- one way of creating a menu is to use scanner and develop case based system to read the input 
- also uses recursion as can be seen at the bottom with the menu() method being called in order to restart menu after completion
### IntByReference Challenge 
```java
public void swapToLowHighOrder(IntByReference num){
    if (num.getvalue() < value){
        int temp = num.getvalue();
        num.setvalue(value);
        value = temp;
```
- this shows how we can implement swaps in order to sort based on highest values 
- swap is an important concept for many sorts and structures 
```java
public String toString(){
    return Integer.toString(value);
}
```
- getting a better understanding of how to use the toString method 
- Helps here to change the inputted strings to integers so we can begin sorting 
### Matrix Challenge 
```java
        for (int a = matrix.length-1; a >= 0; a--){
            for (int b = matrix[a].length-1; b >= 0; b--){
                if(matrix[a][b]<0){output += "  ";}
                else{output += Integer.toHexString(matrix[a][b]) + " ";}
            }
            output += "\n";
        }

        return output;
    }
```
- showing understanding of how we can use nested for loops to extract data 
- 2D arrays are a good way of storing data, and this is how we can use the data in order to create matrix

## Week 1 Learnings
### [Link to wiki](https://github.com/BillyCherres/squirty_grinnellians/wiki/Week-1-Code-Rohan)
- This link contains all my learnings and code snippets for week 1 and tt1
- helped consolidate my understanding of how linked lists are used to store and move objects 
- Learned how queues work and what methods like .add() and .remove() can be utilized to work them 

## Week 2 Learnings 
### [Link to wiki](https://github.com/BillyCherres/squirty_grinnellians/wiki/Week-2-Calculator-Challenge---Rohan)
- This link contains all me learnings and code snippets for week 2 and tt2
- got to learn the usefulness of reverse polish notation in a calculator setting
- had to work off my my previous knowledge of arrays and toString() in order to sort the objects
- Ultimately have a better understanding of stacks and first in first out vs first in last out 

## Week 3 Learnings 
### Bubble Sort  
```java
        public void bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
```
- bubble sort works by repeatedly swapping the adjacent elements if they are in wrong order
- the nested for loop goes through the array over and over again checking until completely sorted
- works heavily off of swaps as the integers are swapped depending on their value 
- The big O notation for this is O(n²), or "Big O squared"
- It is a simple sort but can take very long at a high number of elements 
### Insertion Sort 
```java
    public static void insertsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements around like a good old sorting algorithm */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
```
- insertion sort goes through every value in the array and determines where it needs to go based on value 
- this means it is popping a value out and then inserting it back in, hence "insertion"
- on average and worst cases insertion will run O(n²)
- the best case it will run just O(n)
- This makes it a bit better than the bubble sort when we have more elements
### Merge Sort
```java
    public void divide(int startIndex,int endIndex){

        //Divide till you breakdown your list to single element
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(startIndex, mid);
            divide(mid+1, endIndex);

            //merging Sorted array produce above into one sorted array
            merger(startIndex,mid,endIndex);
        }
    }
```
- this part is the division process that is so important to the merge sort process
```java
    public void merger(int startIndex,int midIndex,int endIndex){

        //Below is the mergedarray that will be sorted array Array[i-midIndex] , Array[(midIndex+1)-endIndex]
        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();

        int leftIndex = startIndex;
        int rightIndex = midIndex+1;

        while(leftIndex<=midIndex && rightIndex<=endIndex){
            if(inputArray.get(leftIndex)<=inputArray.get(rightIndex)){
                mergedSortedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(inputArray.get(rightIndex));
                rightIndex++;
            }
        }

        //Either of below while loop will execute
        while(leftIndex<=midIndex){
            mergedSortedArray.add(inputArray.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex<=endIndex){
            mergedSortedArray.add(inputArray.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = startIndex;
        //Setting sorted array to original one
        while(i<mergedSortedArray.size()){
            inputArray.set(j, mergedSortedArray.get(i++));
            j++;
        }

    }
```
- this part is where it loops and sorts merged loops
- this process is fairly effective being O(nlogn)
- this is because it splits in half each time, which is very quick at higher elements 
- gets better and better compared to the other sorts with more elements added 
### Selection Sort 
```java
    public static void selectionsort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
```    
- selection sort goes through the array over and over again, "selecting" the smallest integer each time and putting it at the front
- similar to the insertion sort, this sort has a O(n²) notation
- it is fairly slow and gets worse as more and more elements are added as you have to go through the whole thing everytime

## Final Crossover Contributions 
### 
