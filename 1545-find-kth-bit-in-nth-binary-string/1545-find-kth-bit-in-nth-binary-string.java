class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('0');
        for (int i = 2, l = 1; i <= n; i++){
            l = l * 2 + 1;
            String add = invert(sb);
            sb.append('1').append(add);
            if (l >= k) return sb.charAt(k - 1);
        }
        return '0'; // dummy return;
    }
    
    private String invert(StringBuilder s) {
        StringBuilder sb = new StringBuilder();
        for (int l = s.length(), i = l - 1; i >= 0; i--) {
            sb.append(s.charAt(i) == '0' ? '1' : '0');
        }
        return sb.toString();
    }
}