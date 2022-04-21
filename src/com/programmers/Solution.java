package com.programmers;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    boolean[][][] visited;
    int X = 5, Y = 5;
    int answer = 0;

    public int solution(String dirs) {
        visited = new boolean[11][11][4];
        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int d = 0;
            switch (c) {
                case 'D':
                    d = 1;
                    break;
                case 'R':
                    d = 2;
                    break;
                case 'L':
                    d = 3;
                    break;
            }
            moving(d);
        }
        return answer;
    }

    private void moving(int d) {
        int nx = X + dx[d];
        int ny = Y + dy[d];
        if (nx < 0 || ny < 0 || nx >= 11 || ny >= 11)
            return;
        System.out.println(nx+","+ny+","+d);
        if (!visited[nx][ny][d]) {
            visited[nx][ny][d] = true;
            if(d==0) d=1;
            else if(d==1) d=0;
            else if(d==2) d=3;
            else if(d==3) d=2;
            visited[X][Y][d] = true;
            answer += 1;
        }
        X = nx;
        Y = ny;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("UDU");
        System.out.println("solution1 = " + solution1);
    }
}
