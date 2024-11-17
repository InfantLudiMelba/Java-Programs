public class arrayanagram {
    public static void main(String[] args){
        String[] s={"catch","got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String a="ate";
        for(int i=0;i<s.length;i++){
            int count=0;
            if(s[i].length()==a.length()){
                for(int j=0;j<s[i].length();j++){
                    for(int k=0;k<a.length();k++){
                        if(a.charAt(k)==s[i].charAt(j)){
                            count++;
                        }
                    }
                }

            }
            if(count==a.length()){
                System.out.println(s[i]);
            }
        }
    }
}
