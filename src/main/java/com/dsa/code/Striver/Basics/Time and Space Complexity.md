Big O : Worst Case.

When dealing with time and space complexity you will see these three greek letters.

  -  Big Omicron or Big O (O): Represents the worst-case scenario for an algorithm.
  -  Big Theta (Θ): Represents the average case for an algorithm.
  -  Big Omega (Ω): Represents the best-case scenario for an algorithm.

  To see how to use it , Lets assume array and say we're going to use a loop to loop through the sorted array.

   [0] [1] [2] [3] [4] [5] [6] -> index
  _____________________________
  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | -> elements
  -----------------------------
  (Ω)          (Θ)          (O)


  So we are looking at how many times that we have to run the loop.
   -(Ω)Our best case would be we're looking for the number 1.(Because its at very first position of the array)
   -(Θ)Average case would be  if we looking for number 4.(Because its at middle of the array)
   -(O)Worst case would be if we looking for number 7.(because its at end of the array


Technically Big O is always worst case.

Let's assume the code below.

class Example{
    public static void main(String[] arg){
     printItems(5);
    }

    private static void printItems(int n){
     for(int i=0;i<n;i++){
     System.out.println(i);
     }
    }
}







