class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        int sum=0;
        int k=2;
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        st.push(tokens[0]);
        st.push(tokens[1]);


        for(int i=2;i<tokens.length;i++){
            // System.out.println(!tokens[i].equals(\-\));
            if(tokens[i].equals(\-\)||tokens[i].equals(\+\)||tokens[i].equals(\*\)||tokens[i].equals(\/\)){
                     if(tokens[i].equals(\-\)){
                 
                    k=2;
                    int a=Integer.parseInt(st.pop());
                    int b=Integer.parseInt(st.pop());
                    sum+=(b-a);
                     st.push(String.valueOf(b-a));
                    // sum=0;
                }
                else if(tokens[i].equals(\+\)){
                 
                    k=2;
                    int a=Integer.parseInt(st.pop());
                    int b=Integer.parseInt(st.pop());
                    sum+=(b+a);
                     st.push(String.valueOf(b+a));
                    // sum=0;
                }
                if(tokens[i].equals(\*\)){
                 
                    k=2;
                    int a=Integer.parseInt(st.pop());
                    int b=Integer.parseInt(st.pop());
                    System.out.println(a);
                    System.out.println(b);
                    
                    st.push(String.valueOf(b*a));
                    // sum=0;
                }
                if(tokens[i].equals(\/\)){
                 
                    k=2;
                   
                    int a=Integer.parseInt(st.pop());
                    int b=Integer.parseInt(st.pop());
                    sum+=(b/a);
                     st.push(String.valueOf(b/a));
                    // sum=0;
                }
            }
            else{
                st.push(tokens[i]);
           
            }

            
    }
//    System.out.println(st);
    return Integer.parseInt(st.pop());
    }
}