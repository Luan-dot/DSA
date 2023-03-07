     static int ans(int[] nums,int target){
        int start=0;
        int end=1;
        while(target>nums[end]){    // this increases the size of the box exponentially and the reason for this is that we're not allowed to use the arr.length.
            int newStart=end+1;
            end=end+((end-start+1)*2); 
            start=newStart;
        }
        return binarySearch(nums,target,start,end);
     }
     static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
         return -1;
     }
