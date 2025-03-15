class Spreadsheet {
    private int[][] grid;

    public Spreadsheet(int rows) {
        grid = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int row = Integer.parseInt(cell.substring(1)) - 1;
        int col = cell.charAt(0) - 'A';
        grid[row][col] = value;
    }
    
    public void resetCell(String cell) {
        int row = Integer.parseInt(cell.substring(1)) - 1;
        int col = cell.charAt(0) - 'A';
        grid[row][col] = 0;
        
    }
    
    public int getValue(String formula) {
    formula = formula.substring(1); // Remove '='
    
    int plusIndex = -1;
    for (int i = 0; i < formula.length(); i++) {
        if (formula.charAt(i) == '+') {
            plusIndex = i;
            break;
        }
    }
    
    String part1 = formula.substring(0, plusIndex);
    String part2 = formula.substring(plusIndex + 1);

    return gO(part1) + gO(part2);
}

private int gO(String operand) {
    if (Character.isDigit(operand.charAt(0))) {
        return Integer.parseInt(operand);
    } else {
        int row = Integer.parseInt(operand.substring(1)) - 1;
        int col = operand.charAt(0) - 'A';
        return grid[row][col];
    }
}
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */