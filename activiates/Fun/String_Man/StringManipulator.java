public class StringManipulator {

    public String trimAndConcat(String a, String b) {

        StringManipulator manipulator = new StringManipulator();
        String str = a.trim() + b.trim();
        return str;

    }


    public Integer getIndexOrNull(String abc, char def) {

        StringManipulator manipulator = new StringManipulator();
        char letter = def;
        Integer a = abc.indexOf(letter);
        if (a > 0) {
            return a;
        }
        else {
            return null;
        }

    }
    

    public Integer getIndexOrNull(String abc, String def) {

        StringManipulator manipulator = new StringManipulator();


        String word = abc;
        String subString = def;

        Integer sub = word.indexOf(subString);

        if (sub > 0) {
            return sub;
        }
        else {
            return null;
        }

    }


    public String concatSubstring(String abc , int start, int end, String def) {

        StringManipulator manipulator = new StringManipulator();


        String word = abc.substring(start, end);
        return word + def;

    }
    
}