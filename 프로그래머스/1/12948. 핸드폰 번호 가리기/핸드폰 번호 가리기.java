class Solution {
    public String solution(String phone_number) {
        char[] charArray = phone_number.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length - 4; i++) {
            charArray[i] = '*';
        }

        return new String(charArray);
    }
}

