class ParkingSystem {
    int b,m,s;

    public ParkingSystem(int big, int medium, int small) {
        
         b=big;
        m=medium;
        s=small;
        
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(this.b>0){
                this.b--;
                return true;
               
            }
            else
                return false;
        }
        else if(carType==2){
            if(this.m>0){
                this.m--;
                return true;
            }
            else
                return false;
            
        }
        else{
            if(this.s>0){
                this.s--;
                return true;
            }
            else
                return false;
            
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
