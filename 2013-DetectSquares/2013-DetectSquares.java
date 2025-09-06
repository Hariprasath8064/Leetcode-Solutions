// Last updated: 9/6/2025, 11:12:19 PM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isBlack(coordinate1) == isBlack(coordinate2);
    }

    private boolean isBlack(String coord) {
        char col = coord.charAt(0);
        int row = coord.charAt(1) - '0';
        if (col == 'a' || col == 'c' || col == 'e' || col == 'g') {
            return row % 2 == 1;
        } else {
            return row % 2 == 0;
        }
    }
}
