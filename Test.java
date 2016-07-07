public class Test{



	public static void main(String []args){


		try{
			  throw RuntimeException();

		}
		finally{

			System.out.println("below is violations");

			return; //violation

		      }




		




		try{

			  throw RuntimeException();
		  }
		 catch(Exception e){
		 }
		 finally{
			


			return ; //false positive.
		}
		

		try{
			throw RuntimeException();

		}
		catch(Exception e){

		throw RuntimeException();
		}
		finally{
		
	
			return; //

		 }


		try{}
		catch(Exception e)
		{}
   		finally{

			try{}
			catch(Exception e){
throw RuntimeError();
}

		}



}
}
