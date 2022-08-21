package loops;

public class LabelBreakExmple {
	
 public static void main(String[] args)
		    {
		        second:
		        for(int i=1;i<=3;i++)//1=1<=3 2<=3 3<=3
		        {
		            first:
		            for(int j=1;j<=3;j++)//j=1<=3 j=2<=3 3<=3 4<=3=f
		                                 ////j=1<=3 j=2<=3 3<=3 4<=3=f
		                                   //j=1<=3 j=2<=3 3<=3 4<=3=f
		            {
		                if(i==2 && j==2)
		                {
		                    break second;//label break
		                }
		                System.out.println(i+" "+j);//1 1 
		                                            // 1 2
		                                           //1  3
		                                           //2  1
		                                         //2 2 
		                                         //2 3
		                                        //3 1
		                                       //3 2
		                                       //3 3
		            }
		        }

	}

}
