class Solution {
    public int myAtoi(String str) {
        long result = 0;
        boolean isPositive = true;
        int position = 0;
        
        while (position < str.length() && str.charAt(position) != ' ') {
            position++;
        }
        
        if (position < str.length() && (str.charAt(position) == '-' || str.charAt(position) == '+')) {
            if (str.charAt(position) == '-')
                isPositive = false;
            position++;
        }
        
        String accumulator = "";
        while (position < str.length() && str.charAt(position) != ' ') {
            
            if (Character.isDigit(str.charAt(position))) {
                accumulator += Character.toString(str.charAt(position));
                System.out.println(accumulator);
            }
            
            result = (int)Long.parseLong(accumulator);
            break;
        }
        
        return (int)result;
    }
}