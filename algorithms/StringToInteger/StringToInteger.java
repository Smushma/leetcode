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
        
        while (position < str.length() && Character.isDigit(str.charAt(position))) {
            
			result *= 10 + (str.charAt(position) - '0');
				
            if (isPositive && result > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if (!positive && num > Integer.MAX_VALUE)
				return Integer.MIN_VALUE;
			
			position++;
        }
        
		if (!positive)
			num *= -1;
		
        return (int)result;
    }
}