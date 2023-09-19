public class ProcessStrings implements StringWork{
    @Override
    public int countCh(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++){
                c++;
        }
        return c;
    }

    @Override
    public String strOut(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 1 ; i < str.length(); i+=2){
            temp.append(str.toCharArray()[i]);
        }
        str = temp.toString();
        return temp.toString();
    }

    @Override
    public String reverse(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() -1 ; i >= 0; i--){
            temp.append(str.toCharArray()[i]);
        }
        str = temp.toString();
        return temp.toString();
    }
}
