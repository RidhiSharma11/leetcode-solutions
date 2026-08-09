class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(ch=='i' || ch=='e'||ch=='o'||ch=='u'||ch=='a'){
                count++;
            }          
        }

        int maxLen=count;

        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i-k);
            if(ch=='i' || ch=='e'||ch=='o'||ch=='u'||ch=='a'){
                count--;
            }

            char ch1 = s.charAt(i);
            if(ch1=='i' || ch1=='e'||ch1=='o'||ch1=='u'||ch1=='a'){
                count++;
            }
            maxLen = Math.max(maxLen,count);    
        }    
        return maxLen;
    }
}