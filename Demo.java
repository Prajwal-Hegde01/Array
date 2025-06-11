Class Demo{
    public static void main(strig[] args) {
        int arr[] = new int[]();
        int arr[5] = { 25, 30, 35, 40, 45 };

        int sum = 0;
        int avg = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        avg = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    

        int min = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
 System.out.println("Minimum: IS meeeeeeeeeeeee ");
  System.out.println("I am a robot,Verified ");     
