package com.Arrays;

public class BookAllocation {
    public static boolean ispossiblesol(int[] page, int n, int m, int mid) {
        int studentCount = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //For Student 1
            if (sum + page[i] <= mid) {

                sum += page[i];
            } else {
                //For Student 2
                studentCount++;
                if (studentCount > m || page[i] > mid) {
                    return false;
                }
                sum = page[i];
            }
        }
        return true;
    }

    public static int Bookallocate(int[] page, int n, int m) {
        n = page.length;
        int start = 0;

        int pagesum = 0;
        for (int i = 0; i < n; i++) {
            pagesum += page[i];
        }
        int end = pagesum;
        int ans = -1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (ispossiblesol(page, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] pages = {10, 20, 30, 40};
        int n = pages.length;
        int result = Bookallocate(pages, n, 2);
        System.out.println("The answer is:" + result);
    }
}
