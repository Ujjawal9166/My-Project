class LadderMarks
{
  public static void main(String[] args)
  {
    int mark= 95;
    
    if((mark>=90)&&(mark<=100)) 

    System.out.println("Excellent");
    
    else if ((mark>=80)&&(mark<=89))
    
    System.out.println("Very Good"); 
    
    else if ((mark>=70)&&(mark<=79))
    
    System.out.println("Good"); 
    
    else if ((mark>=60)&&(mark<=69))
   
   System.out.println("Above average"); 
   
   else if ((mark>=50)&&(mark<=59))

   System.out.println("Adult"); 

   else if (mark<=50)
   System.out.println("Poor percentage"); 
   
   else
   System.out.println("invalid");
}
}
