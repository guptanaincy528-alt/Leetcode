class Solution {
    public int compress(char[] chars) {
        


        int read = 0;
        int write = 0;

        while(read < chars.length) {

            char currentChar = chars[read];
            int count = 0;

            while(read < chars.length &&
                  chars[read] == currentChar) {

                count++;
                read++;
            }

            chars[write++] = currentChar;

            if(count > 1) {

                String countStr = Integer.toString(count);

                for(char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}