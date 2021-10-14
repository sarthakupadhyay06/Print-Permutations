public class Quicksort{

    public static void main(String []args){
        int [] arr={9,90,24,13,2,45,55};
        System.out.println("before quicksort");
        display(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println("\nafter quicksort");
        display(arr);
    }
    public static void quicksort(int [] input,int s,int e) {
        if (s >= e) {
            return;
        }
        int pi = partition(input, s, e);
        quicksort(input,s, pi - 1);
        quicksort(input,pi + 1,e);
    }
     static void display(int [] inp){
         for(int i=0;i<inp.length;i++)
             System.out.print(inp[i]+" ");
        }
    public static int partition(int [] inpoot,int s,int e){
    int count=0;
    int pivot=inpoot[s];
    for(int i=s+1;i<e;i++){
        if(inpoot[i]<pivot)
            count++;
    }
    int pivot_index=s+count;
    inpoot[s]=inpoot[pivot_index];
    inpoot[pivot_index]=pivot;
    int i=s;
    int j=e;
//-------------------------------------------
/*following while loop can also be replaced by
 while(i<pivot_index||j>pivot_index)*/
//---------------------------------------------
  while(i<j) {
        while (i < j && inpoot[i] < pivot) {
            i++;
        }
        while(inpoot[j]>pivot) {
            j--;
        }
if(i<=j) {
    int temp = inpoot[i];
    inpoot[i] = inpoot[j];
    inpoot[j] = temp;
    i++;
    j--;
}
    }
    return pivot_index;
}
}
