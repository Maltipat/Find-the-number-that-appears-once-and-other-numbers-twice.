// User function Template for Java
class Sol {
    public static int search(int n, int arr[]) {
        // Traverse in steps of 2, because elements should come in pairs
        for (int i = 0; i < n - 1; i = i + 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];  // mismatched pair मिला
            }
        }
        //If the loop does not find the unique element, then the last element of the array will be the unique one
        return arr[n - 1];
    }
}
