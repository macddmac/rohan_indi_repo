## Study Week 2 Code and MC
- MC I got less than 50%
- [commit](https://github.com/macddmac/rohan_indi_repo/commit/641276b8b1344d520239f6329187ec7f82632f15)
- Explanation: Uses for loops to multiply matrices 
```java

public class MatrixMultiplication {
    public static void main(String[] args) {
        int i, j, k, rowF, rowS, colF, colS;
        int first[][] = new int[10][10];
        int second[][] = new int[10][10];
        int product[][] = new int[10][10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Rows and Cols of First Matrix");
        rowF = scanner.nextInt();
        colF = scanner.nextInt();

        System.out.println("Enter Elements of First Matrix");

        // Input first matrix from user
        for (i = 0; i < rowF; i++) {
            for (j = 0; j < colF; j++) {
                first[i][j] = scanner.nextInt();
            }
        }

        System.out.print("The First Matrix is :\n");
        for (i = 0; i < rowF; i++) {
            for (j = 0; j < colF; j++) {
                System.out.print(first[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Enter Rows and Cols of Second Matrix");
        rowS = scanner.nextInt();
        colS = scanner.nextInt();

        System.out.println("Enter Elements of Second Matrix");

        // Input second matrix from user
        for (i = 0; i < rowS; i++) {
            for (j = 0; j < colS; j++) {
                second[i][j] = scanner.nextInt();
            }
        }

        System.out.print("The Second Matrix is :\n");
        for (i = 0; i < rowS; i++) {
            for (j = 0; j < colS; j++) {
                System.out.print(second[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Multiplying two matrices
        for (i = 0; i < rowF; i++) {
            for (j = 0; j < colF; j++) {
                for (k = 0; k < colS; k++) {
                    product[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Printing Product Matrix
        System.out.println("Product Matrix");
        for (i = 0; i < rowF; i++) {
            for (j = 0; j < colS; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

```

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

        //One by one move boundary of unsorted subarray for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
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
### Binary Search Trees ([video that helped me learn BST structures](https://www.youtube.com/watch?v=pYT9F8_LFTM&ab_channel=mycodeschool))
![image](https://user-images.githubusercontent.com/72889343/162370235-744f287e-d20f-4fbc-815b-fb7abce493c4.png)
```java
// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {

	/* Class containing left
	and right child of current node
	* and key value*/
	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() { root = null; }

	BinarySearchTree(int value) { root = new Node(value); }

	// This method mainly calls insertRec()
	void insert(int key) { root = insertRec(root, key); }

	/* A recursive function to
	insert a new key in BST */
	Node insertRec(Node root, int key)
	{

		/* If the tree is empty,
		return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() { inorderRec(root); }

	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
	20 40 60 80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inorder();
	}
}
```
- Since we have already learned merge sort, I thought it would be fitting to learn its search counterpart
- Binary search works off of the same O(nlogn) idea as merge sort, by dividing up the array into halves each time
- It is thus a very efficient search algorithm at high amount of elements 
- In a binary search tree, all the nodes on the left of the root are less than the right of the root 
- This code essentially does half each time on either side of the root until a suitable position is found 
- This divide and conquer strategy is efficient and a useful algorithm to understand
