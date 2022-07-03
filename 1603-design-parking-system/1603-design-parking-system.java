class ParkingSystem {
    int[] ps = new int[3];
    public ParkingSystem(int big, int medium, int small) {
       ps[0] = big;
       ps[1] = medium;
       ps[2] = small;
    }
    
    public boolean addCar(int carType) {
        boolean ans = false;
        if(carType == 1 && (ps[0]-1)>=0){
            ps[0] = ps[0]-1;
            ans = true;
        }
        else if(carType == 2 && (ps[1]-1)>=0){
            ps[1] = ps[1]-1;
            ans = true;
        }
        else if(carType == 3 && (ps[2]-1)>=0){
            ps[2] = ps[2]-1;
            ans = true;
        }
        return ans;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */