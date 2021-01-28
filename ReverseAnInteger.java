class Solution {
    public String defangIPaddr(String address) {


        StringBuilder x = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char cursor = address.charAt(i);
            if (cursor == '.') {
                x.append("[.]");
            } else {
                x.append(cursor);
            }
        }
        return x.toString();
    }
}
