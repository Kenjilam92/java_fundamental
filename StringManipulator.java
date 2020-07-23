public class StringManipulator {
    public String trimAndConcat(String a, String b){
        return  a.trim().concat(b.trim());
    }
    public Integer getIndexOrNull (String a, char b){
        if (a.indexOf(b) == -1){
            return null;
        }
        return a.indexOf(b);
    }
    public Integer getIndexOrNull (String a, String b){
        if (a.indexOf(b) == -1){
            return null;
        }
        return a.indexOf(b);
    }
    public String concatSubstring (String a, int b, int c, String d){
        String temp = "";
        for (int i=b; i<c; i++){
            temp = temp + a.charAt(i);
        }
        return temp.concat(d);
    }
}
