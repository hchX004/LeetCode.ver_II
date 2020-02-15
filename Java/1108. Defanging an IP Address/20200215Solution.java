


class 20200215Solution {
    public String defangIPaddr(String address) {
        char[] st = address.toCharArray();
        String addString= "[.]";
        char[] add = addString.toCharArray();
        for(int i = 0; i < st.length; i++){
            if(st[i] == '.'){
                st = arrayReplace(st, add, i);
                i += addString.length();
                continue;
            }
        }
        return new String(st);
    }

    private char[] arrayReplace(char[] array, char[] add, int index){
        char[] newArray = new char[array.length + add.length - 1];
		for(int j = 0, k = 0; j + k < newArray.length; k++) {
            if(k == index){
                for(; j < add.length; j++) newArray[j + k] = add[j];
                k++;
                j--;
                newArray[j+k] = array[k];
            }
            else newArray[j + k] = array[k];
        }
        System.out.println(newArray);
        return newArray;
    }
}

/*
class Solution {
    public String defangIPaddr(String address) {
        String[] splits = address.split("\\.");
        StringBuffer stringBuffer = new StringBuffer();
        for (String split : splits) {
            stringBuffer.append(split + "[.]");
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 3);
    }
}

 */