class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        ArrayList<String>a=new ArrayList<String>();
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<(int)Math.pow(2,s.length()); i++) {
            for(int j=0 ; j<s.length();j++){
                 if((i&(1<<j))!=0){

                    sb.append(s.charAt(j));
                }
            }
            a.add(sb.toString());
            sb.setLength(0);
        }         
           
        Collections.sort(a);

        return a;
    }
}
