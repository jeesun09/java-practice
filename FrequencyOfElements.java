//Program to find the frequency of each element in the array


public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 2, 2, 3, 2, 5, 1};
        int fr[] = new int[arr.length];
        int visited = -1;
        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        System.out.println("Element | Frequency");
        for(int i=0; i<arr.length;i++){
            if(fr[i]!=visited){
                System.out.println(" " + arr[i] + "|" + fr[i] + " ");
            }
        }
    }
}
