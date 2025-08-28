class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0; // x-coordinate
        int y = 0; // y-coordinate

        for (int i = 0; i < moves.length(); i++) {
            char temp = moves.charAt(i); 

            if (temp == 'U' || temp == 'u') {
                y += 1;
            }
            if (temp == 'D' || temp == 'd') {
                y -= 1;
            }
            if (temp == 'L' || temp == 'l') {
                x -= 1;
            }
            if (temp == 'R' || temp == 'r') {
                x += 1;
            }
        }
        return(x==0 && y==0);
    }
}