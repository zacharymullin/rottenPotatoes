public class rottenPotatoes
{
   public static void main(String args[]){
   int[][] ratings = {{4,6,2,5},
                      {7,9,4,8},
                      {6,9,3,7}};
   System.out.println(movieAvgRating(ratings, 0));
   System.out.println(reviewerAvgRating(ratings, 2));
   System.out.println(avgRating2018(ratings));
   System.out.println(hardestRater2018(ratings));
   System.out.println(worstMovie2018(ratings));
   }
   
   public static int movieAvgRating(int[][] ratings, int movie){
       int sum = 0;
       for(int i = 0; i < ratings.length; i++){
           sum += ratings[i][movie];
       }
       return Math.round((float)sum/(float)ratings.length);
   }
   
   public static int reviewerAvgRating(int[][] ratings, int reviewer){
       int sum = 0;
       for(int i = 0; i < ratings[reviewer].length; i++){
           sum += ratings[reviewer][i];
       }
       return Math.round((float)sum/(float)ratings[reviewer].length);
   }
   
   public static int avgRating2018(int[][] ratings){
       int sum = 0;
       for(int r = 0; r < ratings.length; r++){
           for(int c = 0; c < ratings[r].length; c++){
               sum += ratings[r][c];
           }
       }
       return Math.round((float)sum / (float)(ratings.length*ratings[0].length));
   }
   
   public static int hardestRater2018(int[][] ratings){     
       int[] sum = new int[ratings.length];
       for(int r = 0; r < ratings.length; r++){
           for(int c = 0; c < ratings[r].length; c++){
               sum[r] += ratings[r][c];
           }
       }
       
       int min = sum[0];
       int indexMin = 0;
       for(int i = 1; i < sum.length; i++){
           if(sum[i] < min){
               min = sum[i];
               indexMin = i;
           }
       }
       return indexMin;
   }    
   public static int worstMovie2018(int[][] ratings){
       int[] sum = new int[ratings[0].length];
       int[] avg = new int[ratings[0].length];
       for(int c = 0; c < ratings[0].length; c++){
           for(int r = 0; r < ratings.length; r++){
               sum[c] += ratings[r][c];
               if(r == ratings.length - 1){
                   avg[c] = Math.round((float)sum[c]/(float)ratings.length);
                   //System.out.println(avg[c]);
               }
           }    
       }
       int min = avg[0];
       int minIndex = 0;
       for(int i = 1; i < avg.length; i++){
           if(avg[i] < min){
               min = avg[i];
               minIndex = i;
           }
       }
       return minIndex;
   }
}
