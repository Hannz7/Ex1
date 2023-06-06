package B95;

public class GitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []Stu_Height = {175, 167, 160, 164, 183, 187, 188, 179, 176, 175, 169, 175, 176, 178, 165};
	    int sum =  0;
	    for (int i=0; i<Stu_Height.length; i++)
	      sum += Stu_Height[i];
	    System.out.println("The sum of student height =" + sum);
	    
	    double average = sum/Stu_Height.length;
	    System.out.println("The average of student height =" + average);
	    
	    int shortest = Stu_Height[0];
	    int longest = Stu_Height[0];
	    for (int i = 1; i < Stu_Height.length; i++) {
	         if (Stu_Height[i] > longest)
	          longest = Stu_Height[i];
	         else if (Stu_Height[i] < shortest)
	          shortest = Stu_Height[i];}
	         System.out.println("longest height =" + longest);
	         System.out.println("shortest height =" + shortest);

	}

}
