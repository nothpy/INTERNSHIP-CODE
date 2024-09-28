class patternpro{
    public static void main(String[] args) {
        int n=11;
        int midi = n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j= 1;j<=n;j++) 
            {
                if(i==midi || j==midi ||(j==n && i>midi) || (i==1 &&j>midi) || (i==n&& j<midi) || (j==1 && i<midi)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        // output 
        /*
                    *         * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * * * * * * *
                              *         *
                              *         *
                              *         *
                              *         *
                    * * * * * *         *
         */
        System.out.println("");
         for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j <= n; j++)
             {
                if (j<=i)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }
         // output
          /*
                *
                * *                   
                * * *
                * * * *
                * * * * *
                * * * * * *
                * * * * * * *
                * * * * * * * *       
                * * * * * * * * *     
                * * * * * * * * * *   
                * * * * * * * * * * * 
           */
         System.out.println("");
         for (int i = n; i <= n; i++)
         {
             for (int j = 1; j <= n; j++)
             {
                if (i<=j)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println("");
         }
         // output
         /*
                             
                    * 
                  * * 
                * * *
              * * * * 
            * * * * *
          * * * * * *
        * * * * * * *
      * * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * *
* * * * * * * * * * *
          */

         System.out.println("");
         for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j<=n; j++)
             {
                if (i+j>n)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }
         // output
         /*
                             
                    * 
                  * * 
                * * *
              * * * * 
            * * * * *
          * * * * * *
        * * * * * * *
      * * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * *
* * * * * * * * * * *
          */
         System.out.println("");
         for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j<=n; j++)
             {
                if (n-i<j)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }
// output
         /*
                         * * * * * * * * * * *
                           * * * * * * * * * *
                             * * * * * * * * *
                               * * * * * * * *
                                 * * * * * * *
                                   * * * * * *
                                     * * * * *
                                       * * * *
                                         * * *
                                           * *
                                             *
          */
         System.out.println("");
         for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j<=n; j++)
             {
                if (j>=i)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }

          // output
         /*
                            * * * * * * * * * * *
                            * * * * * * * * * *
                            * * * * * * * * *
                            * * * * * * * *
                            * * * * * * *
                            * * * * * *
                            * * * * *
                            * * * *
                            * * *
                            * *
                            *

          */
         System.out.println("");
         for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j<=n; j++)
             {
                if (i+j<=n+1)
                System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }
         // output
         /*
                            * * * * * * * * * * *
                            * * * * * * * * * *
                            * * * * * * * * *
                            * * * * * * * *
                            * * * * * * *
                            * * * * * *
                            * * * * *
                            * * * *
                            * * *
                            * *
                            *

          */
    }
}