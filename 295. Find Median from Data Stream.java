class MedianFinder {
             ArrayList<Integer> ar;
    public MedianFinder() {
        ar=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) >= num) {
                ar.add(i, num);
                return;
            }
        } 
        ar.add(num);

    }
    
    public double findMedian() {
        int n=ar.size();
        
        if(n%2!=0){
             int r=ar.get(n/2);
            return r/1.0;
        }else{
            n--;
            int d=n/2;
            int r=ar.get(d++);
            int l=ar.get(d);
            return (l+r)/2.0;
        }
    }
}
