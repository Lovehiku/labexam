public class Main {
    
  //stack implementd by array
        int top;
        int maxSize;
        int[] newArray;
        main(int size)
          maxSize=size-1;
          top=-1;
          size=0;
          newArray=new int[maxSize];
          public boolean  isEmpty() {
            return top==-1;
          }
          public boolean isFull() {
            return top==maxSize-1;
          }
          public static int pop() {
            if(top<maxSize) {
              return newArray[top--];
            }
            else {
              return -1;
            }
        } 
      public void push(int value) {
        if(top<maxSize-1) {
          newArray[++top]=value;
        }
        else {
          System.out.println("stack is full");
        }
        
      }

      public int peek() {
        if(top>=0) {
          return newArray[top];
        }
        else {
          System.out.println("stack is empty");
        }
      }
      
    //merge sort

    private static void mergeSort(int[] inputArray) {    int inputLength = inputArray.length;    if(inputLength < 2) 
        {    
          return;    }   
        int midIndex = inputLength / 2;  
        int[] leftHalf = new int[midIndex];   
        int[] rightHalf = new int[inputLength -  midIndex];       
        for(int i = 0; i < midIndex; i++) {   
          leftHalf[i - midIndex] = inputArray[i];    }
        for(int i = midIndex; i < inputLength; i++) {     rightHalf[i] = inputArray[i];    }      
        mergeSort(leftHalf);    mergeSort(rightHalf);      
        //Merge    merge(inputArray, leftHalf, rightHalf);   }     
        private static void merge(int[] inputArray, int[]  leftH, int[] rightH) {  
          int leftSize = leftH.length;   
          int rightSize = rightH.length;      
          int i = 0;   
          int j = 0;  
          int k = 0;      
          while(i < leftSize && j < rightSize) {     if(leftH[i] <= rightH[j]) {  
            inputArray[k] = leftH[i];      i++;     }   
          else {      inputArray[k] = rightH[j];
          }
            
          k++;    } 
        while(i < leftSize) {     inputArray[k] = leftH[i];    
        i++;    
        k++;    }   
        while(j < rightSize) {     
          inputArray[k] = rightH[j];    
          j++;   
          k++;    }   }
        }
        
      //bubble sort
      public char[] bubbleSort(char[] charArray) {
        for(int m=0;m<charArray.length;m++) {
          if(charArray[m]>charArray[m+1]) {
            char temp=charArray[m];
            charArray[m+1]=charArray[m];
            charArray[m]=temp;
          }
        }
    }
    //array question
      public static void main(String[]args) {
  
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your size");
        int size=input.nextInt();
        System.out.println("Enter the number to be searched");
        int target=input.nextInt();
        int[] array=new int[size];
        for(int j=0;j<size;j++) {
          array[j]=input.nextInt();
        }
    }
        
        for(int i=0;i<array.length;i++) {
          if(array[i]==target) {
            int count=0;
            for(int n=0;n<array.length;n++) {
              
              if(array[n]==target) {
                count+=1;
                
              }
            }
            System.out.println("the number exist"+ count +"times");
      
          }
      
    //deletion questio
    int[] Aarray={};
    int[] newAarray=[];
    int idd=2
    for(int i=0;i<idd;i++){
        newAarray[i]=Aarray[i];

    }
    for(int k=idd+1;k<Aarray.length;k++){
        newAarray[k]=Aarray[k+1];
    }

}
}