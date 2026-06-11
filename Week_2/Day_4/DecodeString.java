package Week_2.Day_4;

public class DecodeString {
    int idx = 0;

    public String decodeString(String s) {

        StringBuilder res = new StringBuilder();

        while (idx < s.length() && s.charAt(idx) != ']') {

            if (Character.isLetter(s.charAt(idx))) {
                res.append(s.charAt(idx++));
            } else {
                int num = 0;

                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx++) - '0');
                }

                idx++; // skip '['
                String decoded = decodeString(s);
                idx++; // skip ']'

                while (num-- > 0) {
                    res.append(decoded);
                }
            }
        }

        return res.toString();
    }
}

