/**
 * Create by 木水 on 2020/9/14.
 */
public class Mommifier {
    public String convert(String string) {
        String result="";
        if (isMore(string)){
            for (int i=0;i<string.length()-1;i++){
                char t1=string.charAt(i);
                char t2=string.charAt(i+1);
                result+=t1;
                if (t1=='a'||t1=='e'||t1=='i'||t1=='o'||t1=='u'){
                    if (t2=='a'||t2=='e'||t2=='i'||t2=='o'||t2=='u'){
                        result+="mommy";
                    }
                }
            }
            result+=string.charAt(string.length()-1);
            return result;
        }
        return string;
    }

    private boolean isMore(String string) {
        double length=0;
        for (int i=0;i<string.length();i++){
            char temp=string.charAt(i);
            if (temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                length++;
            }
        }
        if (length/string.length()>0.3){
            return true;
        }
        return false;
    }
}
