class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList <> ();
        fun(0,target,candidates,new ArrayList<> (),result);
        return result;
    }

    public void fun(int i,int target,int[] candidates,List <Integer> current,List<List<Integer>> result){
        if(i>=candidates.length){
            if(target==0){
                result.add(new ArrayList <> (current));
            }
            return;
        }

        if(candidates[i]<=target){
            current.add(candidates[i]);
            fun(i,target-candidates[i],candidates,current,result);
            current.remove(current.size()-1);
        }

        fun(i+1,target,candidates,current,result);
    }
}