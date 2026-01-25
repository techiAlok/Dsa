package arrayPartOne;

public class trappingRainwater {
    public static int waterTrap(int[] arr) {
       // left Max boundry
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        //right Max boundry
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i > -1; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        //loop
        for (int i = 0; i < arr.length; i++) {
            //water level = min(left max boundry, right max boundry)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trappedWater = waterLevel - heigth[i]
            trappedWater = trappedWater + (waterLevel - arr[i]);
        }


        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        int ans = waterTrap(arr);
        System.out.println(ans);
    }
}
