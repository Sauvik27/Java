public class trial23 implements trial21{
	@Override
	public void displayName(){
		System.out.println("hi, we aare from medical.");
	}
	@Override
	public void getStudentNumber(){
		System.out.println("220 students");
	}
	@Override
	public void getStandard(){
		System.out.println("from MBBS");
	}

	public void getUniversity()
	{
		System.out.println("AIIMS");
	}
	public static void main(String[] args) {
		trial22 eng = new trial22();
		trial23 med = new trial23();
	public void getInterfaceName()
	{
		
	}
		eng.displayName();
		eng.getStudentNumber();
		eng.getStandard();
		eng.getUniversity();

		System.out.println("***************");
		med.displayName();
		med.getStudentNumber();
		med.getStandard();
		med.getUniversity();
	}
}