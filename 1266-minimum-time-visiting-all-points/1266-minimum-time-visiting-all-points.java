class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int row = 0;
        int seconds = 0;
        while(row < points.length - 1){
            int xDistance = Math.abs(points[row+1][0] - points[row][0]);
            int yDistance = Math.abs(points[row+1][1] - points[row][1]);
            seconds += xDistance > yDistance ? xDistance : yDistance;
            row++;
        }
        return seconds;
    }
}