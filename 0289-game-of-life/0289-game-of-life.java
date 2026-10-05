class Solution {
    public void gameOfLife(int[][] board) {
        int rowsize=board.length;
        int colsize=board[0].length;
        int rowmove[]={-1,-1,-1, 0,0, 1,1,1};
        int colmove[]={-1, 0, 1,-1,1,-1,0,1};
        for(int i=0;i<rowsize;i++){
           for(int j=0;j<colsize;j++){
               int livecount=0;
               for(int k=0;k<8;k++){
                   int row=i+rowmove[k];
                   int col=j+colmove[k];
                   if(row>=0 && row<rowsize && col>=0 && col<colsize){
                       if(board[row][col]==1 || board[row][col]==2){
                           livecount++;
                       }
                   }
               }
               if(board[i][j]==1){
                   if(livecount<2 || livecount>3){
                       board[i][j]=2;
                   }
               }
               else{
                   if(livecount==3){
                       board[i][j]=3;
                   }
               }
           }
        }
        
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                if(board[i][j]==2){
                    board[i][j]=0;
                }
                else if(board[i][j]==3){
                    board[i][j]=1;
                }
            }
        }
    }
}